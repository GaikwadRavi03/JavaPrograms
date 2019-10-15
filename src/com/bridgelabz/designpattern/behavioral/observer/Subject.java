package com.bridgelabz.designpattern.behavioral.observer;

public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Subscriber sub);

	void notifySubscribe();

	void upload(String title);

}