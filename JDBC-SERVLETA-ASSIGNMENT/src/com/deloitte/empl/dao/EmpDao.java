package com.deloitte.empl.dao;

import java.util.List;
import com.deloitte.empl.beans.Emp;

public interface EmpDao {
	void openConnection();
	void close();
	int addEmp(Emp emp); 
	List<Emp> getEmpls();
	Emp getEmpByCode(int empcode);
	int updateSalByCode(double sal,int empcode);
	int updateCommByCode(double comm,int empcode);
	int updateDeptnoByCode(int deptno,int empcode);
	int updateMgrByCode(int mgr,int empcode);
	int updateJobByCode(String job,int empcode);
	int deleteRowByCode(int empcode);

}
