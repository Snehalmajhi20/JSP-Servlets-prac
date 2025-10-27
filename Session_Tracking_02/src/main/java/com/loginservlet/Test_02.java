package com.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Test_02 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] cookies = req.getCookies();
		if(cookies.length == 0) {
			resp.sendRedirect("index.html");
		}
		else {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("User Entered Email: "+cookies[0].getValue());
			out.println("User Entered password: "+cookies[1].getValue());
			out.println("<a href='Logout'>Logout</a>");
		}
	}

}
