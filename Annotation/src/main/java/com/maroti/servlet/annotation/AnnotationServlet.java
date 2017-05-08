package com.maroti.servlet.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/simple", initParams={
		@WebInitParam(name="foo", value="xxx"),
		@WebInitParam(name="bar", value="yyy"),
})
public class AnnotationServlet extends HttpServlet {

	
	
	public void init(ServletConfig config) throws ServletException {
	
	String foo=config.getInitParameter("foo");
	String bar=config.getInitParameter("bar");
		System.out.println(foo+"------"+bar);
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	resp.setContentType("text/html");
	out.print("<h1>"+"Annotation servlet Successfully executed...........!"+"</h1>");
	
	}
}
