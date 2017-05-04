package com.poc.todo;

import java.util.Date;

public class Todo {
	
	private String user;
	private int id;
	private Date targetDate;
	private boolean isDone;
	private String desc;
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
		
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Todo [user=" + user + ", id=" + id + ", targetDate=" + targetDate + ", isDone=" + isDone + ", description=" + desc +"]";
	}

	public Todo(String user, int id, Date targetDate, boolean isDone, String desc) {
		super();
		this.user = user;
		this.id = id;
		this.targetDate = targetDate;
		this.isDone = isDone;
		this.desc = desc;
	}
	
	

	
	

}
