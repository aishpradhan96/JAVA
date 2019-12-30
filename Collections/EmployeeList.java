package utils;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> emplist = new ArrayList<>();
		int code = sc.nextInt();
		String name= sc.next();
		double esalary= sc.nextDouble();
		emplist.add( new Employee(code,name, esalary));
		emplist.add(new Employee(101,"Deloitte",5000));
		emplist.add(new Employee(102,"Aish", 8000));
		for(Employee emp: emplist)
			System.out.println(emp.getEmpCode()+" "+emp.getEmpName()+" "+emp.getSalary());

	}

}
