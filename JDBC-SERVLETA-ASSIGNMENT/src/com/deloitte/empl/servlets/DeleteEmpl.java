package com.deloitte.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class DeleteEmpl
 */
@WebServlet("/DeleteEmpl")
public class DeleteEmpl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		EmpDao dao = new EmpDaoImpl();	
		int empno = Integer.parseInt(request.getParameter("empno"));
		int rows = dao.deleteRowByCode(empno);
		RequestDispatcher rd = null;
		if(rows==1){
			out.println("<h2><font color=powderblue> Record Deleted</h2>");
			rd = request.getRequestDispatcher("DeleteEmpl.html");
			rd.include(request, response);
		}
		else{
			out.println("<h2><font color=red> Record NOT Deleted</h2>");
			rd = request.getRequestDispatcher("DeleteEmpl.html");
			rd.include(request, response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
