package com.wuqinduo.web.message.req;
/**
 * 图片消息
 * @author yhcloud_user
 *
 */
public class ImageMessage extends BaseMessage {

	 // 图片链接
    private String PicUrl;
 
    public String getPicUrl() {
        return PicUrl;
    }
 
    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }
	
	
}
