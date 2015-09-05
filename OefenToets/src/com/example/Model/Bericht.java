package com.example.Model;

import java.util.Observable;

public class Bericht extends Observable {
	private String message;
	private String sender;
	private boolean isRead;
	private int priority;
	
	public Bericht(String message, String sender, int priority){
		this.message = message;
		this.sender = sender;
		isRead = false;
		setPriority(priority);
		
	}

	public String getMessage() {
		return message;
	}

	public String getSender() {
		return sender;
	}

	public boolean isRead() {
		return isRead;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		if(priority<1){
			this.priority = 1;
		} else if(priority>3){
			this.priority = 3;
		} else {
			this.priority = priority;
		}
		
	}
	private void edited(){
		hasChanged();
		notifyObservers();
	}
	public void setIsRead(boolean isRead){
		this.isRead = isRead;
	}
	

}
