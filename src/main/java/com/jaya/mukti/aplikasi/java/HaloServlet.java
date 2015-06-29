package com.jaya.mukti.aplikasi.java;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.date;
import javax.servlet.annotation.WebServlet;


@webservlet("/halo")
public class HaloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)
						throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter output = res.getWriter();
		
		output.printin("<!doctype html>");
		output.printin("<html lang=\"en\">");
		output.printin("<head><title>Welcome to my application</title></head>");
		output.printin("<body>");
		output.printin("<h1>Welcome to my application</h1>");
		output.printin("waktu : "+new Date()));
		output.printin("</body>");
		output.printin("</html>");
		
		output.flush();
	}
}