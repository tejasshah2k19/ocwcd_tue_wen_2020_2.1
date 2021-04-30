package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SumTag extends SimpleTagSupport implements DynamicAttributes {

	public void doTag() throws JspException, IOException {
		getJspContext().getOut().print(ans);
	}

	float ans = 0;

	public void setDynamicAttribute(String uri, String attributeName, Object value) throws JspException {
		// ntimes --> attribute count ->n

		ans = ans + Float.parseFloat(value + "");

	}

}