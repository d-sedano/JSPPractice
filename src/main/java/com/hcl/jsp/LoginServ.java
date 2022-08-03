package com.hcl.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServ extends GenericServlet {
	
	private static final long serialVersinUID = 1L;
	public void init() {
		System.out.println("Inside Login servlet init() method");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		
	}

	
}
