package com.deloitte.empl.utils;

public class EmpUtils {
	public static String insertqry="insert into emp values(?,?,?,?,?,?,?,?)";
	public static final String GETEMPLS = "select * from emp";
	public static final String GETEMPlBYCODE = "select * from emp where empno=?";
	public static String updatesal = "update emp set sal=? where empno=?";
	public static String updatecomm = "update emp set comm=? where empno=?";
	public static String updatedeptno = "update emp set deptno=? where empno=?";
	public static String updatemgr = "update emp set sal=? where empno=?";
	public static String updatejob = "update emp set sal=? where empno=?";
	public static final String DELETEROW = "delete from emp where empno=?";
	
}
