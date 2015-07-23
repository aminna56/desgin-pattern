package com.thinksky;

import com.thinksky.observer.BinaryObserver;
import com.thinksky.observer.OctalObserver;
import com.thinksky.observer.Subject;

public class App {

	public static void main(String[] args) {

		Subject subject = new Subject();

		BinaryObserver binObserver = new BinaryObserver(subject);
		OctalObserver octObserver = new OctalObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		//subject.detach(binObserver);
		subject.setState(10);

	}

}
