package accountassgn;

import java.util.Scanner;

public class AccountApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountOperation operations = new AccountOperation();
		int i=0;
		do{
			System.out.println("Choose an operation:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			i = sc.nextInt();
			int acno;
			double amount;
			
			switch(i){
			case 1:
				System.out.println("Enter Account Number: ");
				acno= sc.nextInt();
				operations.checkBalance(acno);
				break;
			case 2:
				System.out.println("Enter Account Number: ");
				acno= sc.nextInt();
				System.out.println("Enter amount to be deposited: ");
				amount =sc.nextDouble();
				operations.deposit(acno,amount);
				break;
			case 3:
				System.out.println("Enter Account Number: ");
				acno= sc.nextInt();
				System.out.println("Enter amount to be deposited: ");
				amount =sc.nextDouble();
				operations.withdraw(acno,amount);
				break;
			case 4:
				break;
			default:
				System.out.println("Choose an option from the menu!!!");
			}
		}while(i!=4);
	}
}
