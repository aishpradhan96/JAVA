package com.deloitte.dept.dao;

import java.util.List;

import com.deloitte.dept.beans.Dept;

public interface DeptDao {
	void openConnection();
	void close();
	int addDept(Dept dept); 
	List<Dept> viewDept();
	Dept getDept(int deptno);
	int updateLoc(String loc,int deptno);
	int updateDname(String dname,int deptno);
	int deleteDept(int deptno);
}
