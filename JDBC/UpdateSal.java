package com.deloitte.empl.applications;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class UpdateSal {

	public static void main(String[] args) {
		Emp emp = new Emp();
		EmpDao dao = new EmpDaoImpl();	
		int rows = dao.updateSalByCode(1111, 11);
		if(rows>0)
			System.out.println("updated");
		else
			System.out.println("not updates");

	}

}
