package com.wuqinduo.web.message.resp;
/**
 * 视频消息
 * @author yhcloud_user
 *
 */
public class VideoMessage extends BaseMessage {

	
	private Video Video;

	public Video getVideo() {
		return Video;
	}

	public void setVideo(Video video) {
		Video = video;
	}
}
