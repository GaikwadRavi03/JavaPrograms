package com.bridgelabz.designpattern.behavioral.observer;

public class YouTube {
	public static void main(String[] args) {
		Channel telusko = new Channel();// Create channel object.

		// list of Subscribers
		Subscriber s1 = new Subscriber("Alex");
		Subscriber s2 = new Subscriber("Robert");
		Subscriber s3 = new Subscriber("Dom");
		Subscriber s4 = new Subscriber("Jack");
		Subscriber s5 = new Subscriber("Rock");

		// channels subscribers.
		telusko.subscribe(s1);
		telusko.subscribe(s2);
		telusko.subscribe(s3);
		telusko.subscribe(s4);
		telusko.subscribe(s5);

		// Subscribers subscribe this channel.
		s1.subscriberChannel(telusko);
		s2.subscriberChannel(telusko);
		s3.subscriberChannel(telusko);
		s4.subscriberChannel(telusko);
		s5.subscriberChannel(telusko);

		// Upload new Video.
		telusko.upload("How to learn Pattern ??");
	}
}
