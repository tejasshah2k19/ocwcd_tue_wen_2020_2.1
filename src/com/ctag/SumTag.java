package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

//1 -> implements Tag 
//2 -> create PageContext and Tag object as instance variable 
//3 -> create getters and setters 
//4 -> override doStartTag, doEndTag , release method

//if you have an attribute then declare that attribute in class file as instance varibale and create getters setters 
//5-> logic 
public class SumTag implements Tag {

	Tag parent; // this will let you the parent tag of sumtag
	PageContext pageContext; // this will helps you to get printwriter / jsp writer

	int n1, n2;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public Tag getParent() {
		return parent;
	}

	public void setParent(Tag parent) {
		this.parent = parent;
	}

	public PageContext getPageContext() {
		return pageContext;
	}

	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	@Override
	public int doStartTag() throws JspException {

		JspWriter out = pageContext.getOut();
		try {
			out.print(n1 + n2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE; // after completion of sum tag , execute jsp page's content 
		
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub

	}

}
