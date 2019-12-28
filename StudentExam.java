package javapro;

public class StudentExam extends LibraryDetails{
	protected int sub1;
	protected int sub2;


	public StudentExam(int regNo, String stdName, String group, int booksDue, int sub1, int sub2) {
		super(regNo, stdName, group, booksDue);
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	public void display(){
		System.out.println("from sub class");
	}

	public void output(){
		int total= sub1+sub2;
		System.out.println(regNo+stdName+group+total+booksDue);
	}

	public static void main(String[] args) {
		Student student = new Student();
		StudentExam exam = new StudentExam(123,"abcd","EE",70,90,3);
		student.display();
		student=exam;
		student.display();
	}

}
