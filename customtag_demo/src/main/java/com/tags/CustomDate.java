package com.tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomDate extends SimpleTagSupport{
	private String format;
	
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out = getJspContext().getOut();
		out.print("<h2> Custom date is : "+ new SimpleDateFormat(format).format(new Date())+"</h2>");
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
}
