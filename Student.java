package javapro;

public class Student {
	protected int regNo;
	protected String stdName;
	protected String group;
	
	public void display(){
		System.out.println("from super class");
	}
	public Student(int regNo, String stdName, String group) {
		super();
		this.regNo = regNo;
		this.stdName = stdName;
		this.group = group;
	}
	public Student(){}
	
}
