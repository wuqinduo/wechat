package com.wuqinduo.web.message.resp;
/**
 * 音乐消息
 * @author yhcloud_user
 *
 */
public class MusicMessage extends BaseMessage {

	private Music Music;  
	   
    public Music getMusic() {  
        return Music;  
    }  
   
    public void setMusic(Music music) {  
        Music = music;  
    }  
}
