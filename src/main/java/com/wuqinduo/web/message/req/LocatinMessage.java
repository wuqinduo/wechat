package com.wuqinduo.web.message.req;
/**
 * 地理位置消息
 * @author yhcloud_user
 *
 */
public class LocatinMessage extends BaseMessage {

	private String Location_x;//地理位置纬度
	
	private String Location_y;//地理位置经度
	
	private String  Scale;//地图缩放大小
	
	private String Label;//地理位置信息。

	public String getLocation_x() {
		return Location_x;
	}

	public void setLocation_x(String location_x) {
		Location_x = location_x;
	}

	public String getLocation_y() {
		return Location_y;
	}

	public void setLocation_y(String location_y) {
		Location_y = location_y;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}
	
	
}
