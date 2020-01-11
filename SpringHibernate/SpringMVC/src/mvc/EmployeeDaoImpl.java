package mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import beans.Employee;

@Repository
public class EmployeeDaoImpl {
	public List<Employee> getEmpls(){
	List<Employee> emplist = new ArrayList<Employee>();
	emplist.add(new Employee(101,"aaa",7000));
	emplist.add(new Employee(102,"bbb",7000));
	emplist.add(new Employee(103,"ccc",7000));
	return emplist;
	}
}
