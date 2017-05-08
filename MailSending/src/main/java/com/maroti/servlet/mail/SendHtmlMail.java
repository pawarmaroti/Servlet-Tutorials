package com.maroti.servlet.mail;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendHtmlMail extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String to ="abc@gmail.com";
		String from ="xyz@gmail.com";
		String host="localhost";
		
		Properties properties=System.getProperties();
		properties.setProperty("mail.smtp.host", host);
		
		Session session=Session.getDefaultInstance(properties);
		MimeMessage msg = new MimeMessage(session);
		
		try {
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setContent("<h1>This is actual message</h1>",
					"text/html" );
			// Send message
			Transport.send(msg);
			String title = "Send Email";
			String res = "Sent message successfully....";
			
			String docType =
					"<!doctype html public \"-//w3c//dtd html 4.0 " +
					"transitional//en\">\n";
					out.println(docType +
					"<html>\n" +
					"<head><title>" + title + "</title></head>\n" +
					"<body bgcolor=\"#f0f0f0\">\n" +
					"<h1 align=\"center\">" + title + "</h1>\n" +
					"<p align=\"center\">" + res + "</p>\n" +
					"</body></html>");
			
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
