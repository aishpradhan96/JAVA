package com.deloitte.dept.utils;

public class DeptUtils {
	public static final String CREATEQ="INSERT INTO DEPT VALUES(?,?,?)";
	public static final String VIEWDEPT = "SELECT * FROM DEPT";
	public static final String GETDEPT = "SELECT * FROM DEPT WHERE DEPTNO=?";
	public static final String UPDATELOC = "UPDATE DEPT SET LOC=? WHERE DEPTNO=?";
	public static final String UPDATEDNAME = "UPDATE DEPT SET DNAME=? WHERE DEPTNO=?";
	public static final String DELETEDEPT = "DELETE FROM DEPT WHERE DEPTNO=?";

}
