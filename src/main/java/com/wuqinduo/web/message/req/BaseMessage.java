package com.wuqinduo.web.message.req;

/**
 * ClassName: BaseMessage
 * @Description: 微信请求消息基本类
 * @author dapengniao
 * @date 2016年3月7日 下午3:03:59
 */
public class BaseMessage {

	// 开发者微信号
	private String ToUserName;
	// 发送方的账号
	private String FromUserName;
	//消息创建的时间
	private long CreateTime;
	//消息类型（text/image/location/link/video/shortvideo）
	private String MsgType;
	//消息ID， 64位整数
	private long MsgId;
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public long getMsgId() {
		return MsgId;
	}
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
	
	
}
