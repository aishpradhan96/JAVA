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
 * Servlet implementation class UpdateDept
 */
@WebServlet("/UpdateDept")
public class UpdateDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		DeptDao dao = new DeptDaoImpl();
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		String[] s = request.getParameterValues("upd");
		RequestDispatcher rd = null;
		
		if(dao.getDept(deptno)==null){
			out.println("<h3>Enter correct Department Number</h3>");
			rd = request.getRequestDispatcher("UpdateDepartment.html");
			rd.include(request, response);
		}
		else{
			try{
				if (s.length>0){
					if (s.equals("dname")){
						String dname = request.getParameter("dname");
						dao. updateDname(dname, deptno);
					}
					else if (s.equals("loc")){
						String loc = request.getParameter("loc");
						dao. updateLoc(loc, deptno);
					}
				}
			}
				catch(NullPointerException e){
					out.println("No parameters Selected");
				}
			}
			
		out.println("<h2><font color=maroon>Updated</font></h2>");
		rd = request.getRequestDispatcher("UpdateDepartment.html");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
