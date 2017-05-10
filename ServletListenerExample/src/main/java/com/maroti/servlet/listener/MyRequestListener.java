package com.maroti.servlet.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.maroti.servlet.model.Login;

@WebListener
public class MyRequestListener implements ServletRequestListener{

	public void requestInitialized(ServletRequestEvent req)
	{
		HttpServletRequest request=(HttpServletRequest)req.getServletRequest();
		System.out.println("Remote Address Initialized : "+request.getRemoteAddr());
		
	}

	public void requestDestroyed(ServletRequestEvent req)
	{
		ServletRequest request=req.getServletRequest();
		System.out.println("Remote Address Destroyed : "+request.getRemoteAddr());
	
		
	}

	

	
}
