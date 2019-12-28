package aishwarya;

public class NumberOfDays {

	public static void main(String[] args) {
		String str= args[0];
		switch(str)
		{
			case "January":
			case "March":
			case "May":
			case "July":
			case "August":
			case "October":
			case "December":
			System.out.println("No of Days= 31");
			break;
			case "Febraury":
				System.out.println("No of Days= 28/29");
				break;
			case "April":
			case "June":
			case "September":
			case "November":
				System.out.println("No of Days= 30");
				break;
			default:
				System.out.println("Enter A Valid Month");
			
		}

		
	}

}
