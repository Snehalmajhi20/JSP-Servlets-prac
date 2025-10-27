package com.loginservlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Logout")
public class Test_03 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		cookies[0].setMaxAge(0);
		cookies[1].setMaxAge(0);
		resp.addCookie(cookies[0]);
		resp.addCookie(cookies[1]);
		resp.sendRedirect("index.html");
	}

}
