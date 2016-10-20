package com.wuqinduo.web.message.resp;
/**
 * 语音消息
 * @author yhcloud_user
 *
 */
public class VoiceMessage extends BaseMessage {

	
	 	private Voice Voice;
	 
	    public Voice getVoice() {
	        return Voice;
	    }
	 
	    public void setVoice(Voice voice) {
	        Voice = voice;
	    }
}
