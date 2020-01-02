package com.deloitte.empl.applications;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class DeleteRowByCode {

	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();	
		int rows = dao.deleteRowByCode(12);
		if(rows==1)
			System.out.println("deleted");
		else
			System.out.println("not deleted");
	}

}
