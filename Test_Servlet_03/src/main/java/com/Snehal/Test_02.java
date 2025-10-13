package com.Snehal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Test_02 implements Servlet {
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Init method.....");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse ser) throws ServletException, IOException {
		System.out.println("Service method.....");
		ser.setContentType("text/html");
		PrintWriter out = ser.getWriter();
		out.println("This Test_02 class which implements to the Servlet");
		out.println("Hi. today current date is: "+new Date().toString());
		
	}

	@Override
	public void destroy() {
		System.out.println("This a destory method.");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
