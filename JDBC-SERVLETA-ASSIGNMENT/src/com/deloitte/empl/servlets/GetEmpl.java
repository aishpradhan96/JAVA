package com.deloitte.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class GetEmpl
 */
@WebServlet("/GetEmpl")
public class GetEmpl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		EmpDao dao = new EmpDaoImpl();
		List<Emp> empls = dao.getEmpls();
		out.println("<h1><FONT COLOR=RED>EMPLOYEE DEATAIL'S</FONT></h1>");
		out.println("<table border=2>");
		out.println("<tr><th>EMPNO</th><th>ENAME</th><th>JOB</th><th>MGR</th><th>HIREDATE</th><th>SAL</th><th>COMM</th><th>DEPTNO</th></tr>");
		for(Emp e : empls){
			out.println("<tr>");
			out.println("<td>"+e.getEmpno()+"</td>");
			out.println("<td>"+e.getEname()+"</td>");
			out.println("<td>"+e.getJob()+"</td>");
			out.println("<td>"+e.getMgr()+"</td>");
			out.println("<td>"+e.getHiredate()+"</td>");
			out.println("<td>"+e.getSal()+"</td>");
			out.println("<td>"+e.getComm()+"</td>");
			out.println("<td>"+e.getDeptno()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
