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
 * Servlet implementation class UpdateEmpl
 */
@WebServlet("/UpdateEmpl")
public class UpdateEmpl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		EmpDao dao = new EmpDaoImpl();
		int empno = Integer.parseInt(request.getParameter("empno"));
		String[] s = request.getParameterValues("up");
		RequestDispatcher rd = null;
		
		if(dao.getEmpByCode(empno)==null){
			out.println("<h3>Enter correct Employee Number</h3>");
			rd = request.getRequestDispatcher("UpdateEmpl.html");
			rd.include(request, response);
		}
		else{
			try{
				if (s.length>0){
					if (s.equals("job")){
						String job = request.getParameter("job");
						dao. updateJobByCode(job, empno);
					}
					else if (s.equals("mgr")){
						int mgr = Integer.parseInt(request.getParameter("mgr"));
						dao. updateMgrByCode(mgr, empno);
					}
					else if (s.equals("sal")){
						double sal = Double.parseDouble(request.getParameter("sal"));
						dao.updateSalByCode(sal, empno);
					}
					else if (s.equals("comm")){
						double comm = Double.parseDouble(request.getParameter("comm"));
						dao.updateSalByCode(comm, empno);
					}
					else if (s.equals("deptno")){
						int deptno = Integer.parseInt(request.getParameter("deptno"));
						dao.updateSalByCode(deptno, empno);
					}
				}
			}
				catch(NullPointerException e){
					out.println("No parameters Selected");
				}
			}
			
		out.println("<h2><font color=maroon>Updated</font></h2>");
		rd = request.getRequestDispatcher("UpdateEmpl.html");
		rd.include(request, response);
	}
			

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
