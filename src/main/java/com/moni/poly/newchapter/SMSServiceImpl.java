package com.moni.poly.newchapter;

public class SMSServiceImpl implements MessageService {

	public void sendMessage(String message, String receiver) {
		System.out.println("Email service impl "+ message + " receiver " +receiver);
	}

}
