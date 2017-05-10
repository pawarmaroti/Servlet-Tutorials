package com.maroti.servlet.listener;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener{

	public void sessionCreated(HttpSessionEvent session) {
		 
		HttpSession s=session.getSession();
		System.out.println("Session is created : "+session.getSession().getId());
		
		
	}

	public void sessionDestroyed(HttpSessionEvent session) {
		
		System.out.println("Session is distroyed");
	}

}
