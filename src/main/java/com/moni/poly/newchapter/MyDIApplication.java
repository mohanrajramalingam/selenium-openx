package com.moni.poly.newchapter;

public class MyDIApplication implements Consumer {

	private MessageService messageServ;
	
	MyDIApplication(MessageService msgServ) {
		this.messageServ = msgServ;
	}
	
	public void processMessages(String message, String receiver) {
		this.messageServ.sendMessage(message, receiver);
	}

}
