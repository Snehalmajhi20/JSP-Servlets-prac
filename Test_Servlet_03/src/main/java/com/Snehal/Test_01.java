package com.Snehal;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Test_01 implements Servlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("This init method.... only execute one time when server load!");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("This service method load evert time.....");
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		out.println("Execute Successfully....");
		out.println("Welcome to the home page and servlet page...");
		
	}

	@Override
	public void destroy() {
		System.out.println("This is destory method is run when program changed when we will call the destory that time will execute..");
		
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
