package com.maroti.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.maroti.servlet.db.DbManager;

public class MyContextListener implements ServletContextListener {

	
	public void contextInitialized(ServletContextEvent ctx) {
		
		ServletContext ct=ctx.getServletContext();
		String driver=ct.getInitParameter("driver");
		String url=ct.getInitParameter("url");
		String username=ct.getInitParameter("username");
		String password=ct.getInitParameter("password");
		
		DbManager db = new DbManager(driver, url, username, password);
		ct.setAttribute("db", db);
		
		System.out.println("Connection initialized for application");
	}
	public void contextDestroyed(ServletContextEvent ctx) {
		
		ServletContext ct=ctx.getServletContext();
		DbManager db=(DbManager)ct.getAttribute("db");
		db.closeConnection();
		System.out.println("Database Connection close for application");
	}


}
