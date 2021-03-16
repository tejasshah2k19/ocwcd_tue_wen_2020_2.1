package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class UserCounter implements HttpSessionListener {

	static int userCounter = 0;

	public void sessionCreated(HttpSessionEvent arg0) {
		userCounter++;
		System.out.println("User LoggedIn =>  " + userCounter);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		userCounter--;
		System.out.println("User LoggedOut =>  " + userCounter);

	}
}
