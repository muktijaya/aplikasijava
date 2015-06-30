package com.jaya.mukti.aplikasi.java;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import com.jaya.mukti.aplikasi.todo;

@WebServlet("/todo/list")
public class TodoListServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
										throws IOException, ServletException {
		
		//Data yang akan ditampilkan, nantinya ambil dari database
		List<todo> daftarTodo = new ArrayList<todo>();
		
		todo t1 = new todo();
		t1.setId(1);
		t1.setketerangan("Registrasi Openshift");
		t1.setselesai(true);
		daftarTodo.add(t1);
		
		todo t2 = new todo();
		t2.setId(2);
		t2.setketerangan("Buat app yang baru");
		t2.setselesai(false);
		daftarTodo.add(t2);
		
		todo t3 = new todo();
		t3.setId(3);
		t3.setketerangan("Deploy aplikasi");
		t3.setselesai(false);
		daftarTodo.add(t3);
		
		//masukkan data ke request attribute
		req.setAttribute("todo", daftarTodo);
		
										
		//redirect ke tampilan
		String lokasijsp = "/WEB-INF/jsp/todo/list.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(lokasijsp);
		rd.forward(req, res);
	}
}