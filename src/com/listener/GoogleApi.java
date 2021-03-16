package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class GoogleApi  implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		//login with google 
		//map
		//weather 
		
		System.out.println("dicconnecting connection....google");
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("establishing connection....google");
	}

}
