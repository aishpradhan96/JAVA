package aishwarya;

public class StudentResult {

	public static void main(String[] args) {
		int regNo=10001;
		int sub1=26;
		int sub2=34;
		int sub3=78;
		int total;
		float avg;
		total=(sub1+sub2+sub3);
		avg=total/3;
		if (sub1>=40 && sub2>=40 && sub3>=40){
			System.out.println("PASS");
		}
			else
				System.out.println("FAIL");
	
	}

}
