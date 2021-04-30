package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

public class UpperTag implements BodyTag {

	Tag parent;
	PageContext pageContext;
	BodyContent bodyContent;

	public BodyContent getBodyContent() {
		return bodyContent;
	}

	public void setBodyContent(BodyContent bodyContent) {
		this.bodyContent = bodyContent;
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
		return EVAL_BODY_BUFFERED;// doInitBody
	}

	@Override
	public void doInitBody() throws JspException {
		// empty
	}

	@Override
	public int doAfterBody() throws JspException {
		// logic
		String body = bodyContent.getString();

		body = body.toUpperCase();

		JspWriter out = bodyContent.getEnclosingWriter();

		try {
			out.print(body);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub

	}

}
