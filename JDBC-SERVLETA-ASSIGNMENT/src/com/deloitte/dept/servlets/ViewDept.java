package com.deloitte.dept.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.dept.beans.Dept;
import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;

/**
 * Servlet implementation class ViewDept
 */
@WebServlet("/ViewDept")
public class ViewDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		DeptDao dao = new DeptDaoImpl();
		List<Dept> dept = dao.viewDept();
		out.println("<h1><FONT COLOR=RED>DEPARTMENT DETAIL'S</FONT></h1>");
		out.println("<table border=2>");
		out.println("<tr><th>DEPTNO</th><th>DNAME</th><th>LOC</th></tr>");
		for(Dept e : dept){
			out.println("<tr>");
			out.println("<td>"+e.getDeptno()+"</td>");
			out.println("<td>"+e.getDname()+"</td>");
			out.println("<td>"+e.getLoc()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
