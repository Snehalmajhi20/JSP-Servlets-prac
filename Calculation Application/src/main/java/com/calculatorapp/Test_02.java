package com.calculatorapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servlet2")
public class Test_02 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sum = (int)req.getAttribute("s");
		
		int fn = Integer.parseInt(req.getParameter("fn"));
		int sc = Integer.parseInt(req.getParameter("sc"));
		int multi = fn * sc;
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Sum: "+sum+ ", "+ "Multiply: "+multi);
	}

}
