package com.stag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport {
	// override
	public void doTag() throws JspException, IOException {
		
		Date d = new Date();
		int h = d.getHours();
		if (h > 0 && h < 11) {
			// morning
			getJspContext().getOut().print("Good Morning");
		}
		if (h >= 12 && h <= 17) {
			// noon
			getJspContext().getOut().print("Good Noon");
		}

		if (h >= 18 && h <= 24) {
			// evening
			getJspContext().getOut().print("Good Evening");
		}

	}
}
