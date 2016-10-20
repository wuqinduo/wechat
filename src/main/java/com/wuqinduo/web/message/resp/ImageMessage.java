package com.wuqinduo.web.message.resp;
/**
 * 图片消息
 * @author yhcloud_user
 *
 */
public class ImageMessage extends BaseMessage {
	
	private Image Image;
	 
    public Image getImage() {
        return Image;
    }
 
    public void setImage(Image image) {
        Image = image;
    }
}
