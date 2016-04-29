package com.jd.shoping.model;

import java.util.Date;

public class Message {
	private int id;//消息的ID
	private String title;//消息的标题
	private String content;//消息的内容
	private Date crerateTime;//消息创建时间

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCrerateTime() {
		return crerateTime;
	}

	public void setCrerateTime(Date createTime) {
		this.crerateTime = createTime;
	}

	

}
