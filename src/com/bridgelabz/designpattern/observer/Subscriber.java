package com.bridgelabz.designpattern.observer;

public class Subscriber implements Observer {
	private String name;
	private Channel channel = new Channel();

	// Parametrized Constructor
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey " + name + ", Video is Uploded to:" + channel.title);
	}

	@Override
	public void subscriberChannel(Channel ch) {
		channel = ch;
	}
}
