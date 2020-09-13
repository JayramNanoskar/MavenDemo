package com.jayram.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jayram.dao.CrudDao;

/**
 * Servlet implementation class AddStudentController
 */
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String place = request.getParameter("place");
		CrudDao cruddao = new CrudDao();
		
		boolean stat = cruddao.addStudent(id, name, place);
	
		request.setAttribute("status", stat);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	
	}

}
