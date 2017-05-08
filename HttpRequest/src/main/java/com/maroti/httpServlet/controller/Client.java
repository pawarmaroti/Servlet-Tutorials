package com.maroti.httpServlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.Local;

public class Client extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	//getCookies
	Cookie[] cookies=req.getCookies();
	String cName=null;
	String cComments=null;
	String cDomain=null;
	String cPath=null;
	String cValue=null;
	int cVersion=0;
	out.print("<html>");
	out.print("<body>");
	
	for(Cookie c : cookies)
	{
		cName=c.getName();
		cComments=c.getComment();
		cDomain=c.getDomain();
		cPath=c.getPath();
		cValue=c.getValue();
		cVersion=c.getVersion();
	}
	out.print("<pre>");
	out.print("Cookies Name : "+cName+"\n Comments : "+cComments+"\n Domain: "+cDomain+"\n Path : "+cPath+"\n Value :"+cVersion+"");
	out.print("</pre>");
	out.print("<pre>");
	
	//getAttributesNames
	
	Enumeration<String> at=req.getAttributeNames();
	while(at.hasMoreElements())
	{
		String attribName=at.nextElement();
		
		out.print("Attribute Name"+req.getAttribute(attribName));
	}
	out.print("</pre>");
	
	
	//getSession
	
	HttpSession session=req.getSession();
	long time=session.getCreationTime();
	String sId=session.getId();
	long lastAccessTime=session.getLastAccessedTime();
	out.print("<pre>"+"Session Id : "+sId+"\n Session time : " +time+ "\n Last Access Time :"+lastAccessTime+"</pre>");
	
	//getAthuenticationType
	
	String aType=req.getAuthType();
	out.print("<pre>"+"Authentication Type : "+aType+"</pre>");
	
	
	//getCharacterEncoding
	String charEnc =req.getCharacterEncoding();
	out.print("<pre>"+"Character Encoding : "+charEnc+"</pre>");
	
	//getContentType
	
	String contentType=req.getContentType();
	out.print("<pre>"+"Content Type : " +contentType+"</pre>");
	
	//getContextPath
	String cpath=req.getContextPath();
	out.print("<pre>"+"Context Path : " +cpath+"</pre>");
	
	//getHeader
	Enumeration<String> header=req.getHeaderNames();
	out.print("<pre>"+"Header :");
	while(header.hasMoreElements())
	{
		String name=header.nextElement();
		out.println(req.getHeader(name));
	}
	
	//getMethod
	out.println("</pre>");
	String methodName=req.getMethod();
	out.println("<pre>"+"\n Method Name :"+ methodName+"</pre>");
	
	//getPathInfo
	
	String pInfo=req.getPathInfo();
	out.println("<pre>"+" Path Info :"+pInfo+"</pre>");
	
	//getProtocol
	String protoName=req.getProtocol();
	out.println("<pre>"+" Protocl :"+protoName+"</pre>");
	
	//getRemmoteAddress
	String remoteAddress=req.getRemoteAddr();
	out.println("<pre>"+" Remote Address :" + remoteAddress+"</pre>");
	
	
	//getRemoteHost
	String remoteHost=req.getRemoteHost();
	out.println("<pre>"+" Remote Host :"+remoteHost+"</pre>");
	
	
	//remote User
	
	String rempteuser = req.getRemoteUser();
	out.println("<pre>"+" Remote User	 :"+rempteuser+"</pre>");
	
	//getRequestUri
	String URI=req.getRequestURI();
	out.println("<pre>"+"Request URI :"+URI+"</pre>");
	
	//getServerName
	String serverName=req.getServerName();
	out.println("<pre>"+" Server Name  :"+serverName+"</pre>");
	
	//getServerPort
	int port=req.getServerPort();
	out.println("<pre>"+" Server Port :"+port+"</pre>");
	
	
	out.print("</html>");
	out.print("<body>");
	}

}
