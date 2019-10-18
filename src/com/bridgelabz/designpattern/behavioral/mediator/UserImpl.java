package com.bridgelabz.designpattern.behavioral.mediator;

public class UserImpl extends User {

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	/**
	 * Purpose : Send Message.
	 */
	@Override
	public void send(String msg) {
		System.out.println(this.name + ": Sending Message=" + msg);
		mediator.sendMessage(msg, this);
	}

	/**
	 * Purpose : Receive Message.
	 */
	@Override
	public void receive(String msg) {
		System.out.println(this.name + ": Received Message:" + msg);
	}

}
