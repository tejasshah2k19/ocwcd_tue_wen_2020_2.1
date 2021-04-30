package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.service.CurrencyRate;

public class CurrencyTag extends SimpleTagSupport {

	// override doTag

	float price;
	String type;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void doTag() throws JspException, IOException {

		// jdbc
		// select
		// sellers [ x 1500 ] [ discount ]
		// sellers - 1500 - 7% amazon
		// vendor
		// bluk - zomato - dennis -> 100 coffe -> 1 coffe -> 30 [40] ->
		//
		JspWriter out = getJspContext().getOut();
		float ans = 0;
		if (type.equalsIgnoreCase("usd")) {
			float usd = CurrencyRate.getUsd();
			out.print(price / usd + "$");
		} else if (type.equals("pound")) {
			float p = CurrencyRate.getPound();
			out.print(price / p);
		} else {
			out.print(price);
		}

	}
}
