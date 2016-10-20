package com.wuqinduo.web.message.resp;
/**
 * 音乐消息消息体
 * @author yhcloud_user
 *
 */
public class Music {
	private String Title;
	private String Description;
	private String MusicUrl;
	private String HQMusicUrl;// 高质量音乐链接，WIFI环境优先使用该链接播放音乐  
	
	private String ThumbMediaId; //缩略图的媒体id

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getMusicUrl() {
		return MusicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}

	public String getHQMusicUrl() {
		return HQMusicUrl;
	}

	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
	
	
}
