package beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empCode;
	private String empName;
	private double salary;
	
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(){
		
	}
	public Employee(int empCode, String empName, double salary) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.salary = salary;
	}
	
}
