package com.maroti.servlet.annotation;

//Annotation filter

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class AnnotationFilter
 * 
 */
@WebFilter(urlPatterns="/*", initParams={
		@WebInitParam(name="foo", value="mmm"),
		@WebInitParam(name="bar", value="pppp"),
})
public class AnnotationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AnnotationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>"+"Annotation Filter Successfully executed...........!"+"</h1>");
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	
		String foo=fConfig.getInitParameter("foo");
		String bar=fConfig.getInitParameter("bar");
			System.out.println(foo+"------"+bar);
	}

}
