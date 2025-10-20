package com.webservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Test_01 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		RequestDispatcher rd;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println();
		
		if("snehalmajhi@gmail.com".equals(email) && "123".equals(password)) {
			rd = req.getRequestDispatcher("/servlet2");
			rd.forward(req, resp);
		}
		else {
			out.println("<h1>Invalid Email and Password</h1>");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
		
	}

}
