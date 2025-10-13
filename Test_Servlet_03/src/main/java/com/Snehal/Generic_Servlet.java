package com.Snehal;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Generic_Servlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse res) throws ServletException, IOException {
		System.out.println("This is Service Method....");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Hi, this generic servlet page and welocme and heartly greetings to you....");
		
	}

}
