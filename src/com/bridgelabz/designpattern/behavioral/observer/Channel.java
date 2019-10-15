package com.bridgelabz.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private List<Subscriber> subs = new ArrayList<Subscriber>();
	String title;

	@Override
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

	@Override
	public void unSubscribe(Subscriber sub) {
		subs.add(sub);
	}

	@Override
	public void notifySubscribe() {
		for (Observer sub : subs) {
			sub.update();
		}
	}

	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscribe();
	}
}
