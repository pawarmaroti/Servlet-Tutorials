package com.maroti.servlet.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrentDate extends HttpServlet {
	
				protected void doGet(HttpServletRequest req, HttpServletResponse resp)
						throws ServletException, IOException {
				
					resp.setContentType("text/html");
					PrintWriter out=resp.getWriter();
					Date nDate = new Date();
					SimpleDateFormat simpleDateFormat= new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
					String date=simpleDateFormat.format(nDate);
					
					
					
					out.print("<html>");
					out.print("<body>");
					out.print("<h1 style='margin:100px 400px 0px 400px; margin-left:40px; text-align:center '>"+"Current Date"+"</h1>");
					out.print("<pre style='margin:10px 400px 100px 400px; margin-left:40px border:1px solid black;'>"+date+"</pre>");
					out.print("</body>");
					out.print("</html>");
					
					
				}
				

}
