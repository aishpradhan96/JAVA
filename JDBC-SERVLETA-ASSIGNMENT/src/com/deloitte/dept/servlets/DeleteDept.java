package com.deloitte.dept.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;

/**
 * Servlet implementation class DeleteDept
 */
@WebServlet("/DeleteDept")
public class DeleteDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		DeptDao dao = new DeptDaoImpl();	
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		int rows = dao.deleteDept(deptno);
		RequestDispatcher rd = null;
		if(rows==1){
			out.println("<h2><font color=powderblue> Record Deleted</h2>");
			rd = request.getRequestDispatcher("DeleteDepartment.html");
			rd.include(request, response);
		}
		else{
			out.println("<h2><font color=red> Record NOT Deleted</h2>");
			rd = request.getRequestDispatcher("DeleteDepartment.html");
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
