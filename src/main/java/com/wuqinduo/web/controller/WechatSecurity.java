package com.wuqinduo.web.controller;


import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wuqinduo.web.util.MessageUtil;
import com.wuqinduo.web.util.SignUtil;
import com.wuqinduo.wechat.dispatcher.EventDispatcher;
import com.wuqinduo.wechat.dispatcher.MsgDispatcher;

@Controller
@RequestMapping("/webchat")
public class WechatSecurity  {
	
	private static Logger logger = Logger.getLogger(WechatSecurity.class);

	/**
	 * @Description: 用于接收get参数，返回验证参数
	 * @param request
	 * @param response
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @param echostr
	 */
	@RequestMapping(value = "security", method = RequestMethod.GET)
	public void doGet(
			HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(value = "signature", required = true) String signature,
            @RequestParam(value = "timestamp", required = true) String timestamp,
            @RequestParam(value = "nonce", required = true) String nonce,
            @RequestParam(value = "echostr", required = true) String echostr){
		
		try {
			if(SignUtil.checkSignature(signature, timestamp, nonce)){
				//确认此次GET请求来自微信服务器，请原样返回echostr参数内容
				PrintWriter out = response.getWriter();
	            out.print(echostr);
	            out.close();
			}else{
				 logger.info("这里存在非法请求！");
			}
			
		} catch (Exception e) {
			logger.error(e, e);
		}
	}
	 @RequestMapping(value = "security", method = RequestMethod.POST)
	    // post方法用于接收微信服务端消息
	public void DoPost(HttpServletRequest request,HttpServletResponse response) {
	        System.out.println("这是post方法！");
	        try {
				Map<String, String> map = MessageUtil.parseXML(request);
				String msgtype=map.get("MsgType");
				if(MessageUtil.REQ_MESSAGE_TYPE_EVENT.equals(msgtype)){
	                EventDispatcher.processEvent(map); //进入事件处理
	            }else{
	                MsgDispatcher.processMessage(map); //进入消息处理
	            }
			} catch (Exception e) {
				logger.error(e, e);
			}
	    }
}
