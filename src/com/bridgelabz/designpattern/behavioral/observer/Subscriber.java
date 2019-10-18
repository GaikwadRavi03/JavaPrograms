package com.bridgelabz.designpattern.behavioral.observer;

public class Subscriber implements Observer {
	private String name;
	private Channel channel = new Channel();

	// Parameterized Constructor
	public Subscriber(String name) {
		this.name = name;
	}

	/**
	 * Purpose : Send this message to all subscribers.
	 */
	@Override
	public void update() {
		System.out.println("Hey " + name + ", Video is Uploded to:" + channel.title);
	}

	@Override
	public void subscriberChannel(Channel ch) {
		channel = ch;
	}
}
