package com.nexwah;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyHashMap<Long, String> output = new MyHashMap<Long, String>();
		Date dd = new Date();
		long t1 = dd.getTime();
		System.out.println(dd);
		output.put(t1, "500");
		output.put(t1+2000, "400");
		output.put(t1+4000, "600");
		output.put(t1+6000, "700");
		output.put(t1+10000, "200");
		output.put(t1+16000, "500");
	    response.getWriter().append(output.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
