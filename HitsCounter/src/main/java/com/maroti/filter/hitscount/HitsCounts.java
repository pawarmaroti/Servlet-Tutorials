package com.maroti.filter.hitscount;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HitsCounts  implements Filter{

	private int count;
	
	public void init(FilterConfig arg0) throws ServletException {
		
	count=0;	
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain fc) throws IOException, ServletException {
		
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		
		count++;
		
		out.print("<html>");
		out.print("<html>");
		out.print("<h1>"+"Total Hits are :"+ count +"</h1>");
		
		fc.doFilter(req, resp);
		
		
		out.print("</body>");
		out.print("</html>");
		
	}

	
	public void destroy() {
		
		
	}

}
