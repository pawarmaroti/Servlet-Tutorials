package com.maroti.servlet.fileDownload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value="/file")
public class FileDownload extends HttpServlet {
	

	public void init(ServletConfig config) throws ServletException {
	
		System.out.println("Servlet Object Created");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		String fileName ="books.txt";
		String filePath="F:\\file\\";
		resp.setContentType("APPLICATION/OCTET-STREAM");
		resp.setHeader("Content-Disposition", "attachment; filename=\""+fileName+"\"");
		FileInputStream fis = new FileInputStream(filePath+fileName);
		int i;
		while((i=fis.read())!=-1)
		{
			out. write(i);
		}
		
		fis.close();
		out.close();
		
	}
	
}
