package com.elfunction;

import java.util.Date;

public class MyElFunction {

	public static String greet() {

		Date d = new Date();
		int h = d.getHours();

		if (h >= 0 && h <= 11) {
			return "Good Morning";
		} else if (h >= 12 && h <= 17) {
			return "Good Noon";
		} else {
			return "Good Night";
		}
	}

	public static String greet(int o) {

		Date d = new Date();
		int h = d.getHours();

		return "Good Morning";
	}

}
