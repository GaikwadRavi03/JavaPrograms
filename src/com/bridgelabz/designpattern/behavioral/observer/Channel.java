package com.bridgelabz.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private List<Subscriber> subs = new ArrayList<Subscriber>(); // list of Subscribers.
	String title;

	/**
	 * Purpose : subscribe Method.
	 */
	@Override
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

	/**
	 * Purpose : unSubscribe Method.
	 */
	@Override
	public void unSubscribe(Subscriber sub) {
		subs.add(sub);
	}

	/**
	 * Purpose : Notification send to subscribers.
	 */
	@Override
	public void notifySubscribe() {
		for (Observer sub : subs) {
			sub.update();
		}
	}

	/**
	 * Purpose : Upload new video title.
	 */
	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscribe();
	}
}
