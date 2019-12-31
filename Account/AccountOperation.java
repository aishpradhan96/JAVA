package accountassgn;
import accountassgn.AccountNotFoundException;
import accountassgn.InsufficientBalanceException;

public class AccountOperation {
	int flag=0;
	Account[] accounts = new Account[5];
	public AccountOperation(){
		accounts[0]= new Account(101, "Default1", 6000);
		accounts[1]= new Account(102, "Default2", 9800);
		accounts[2]= new Account(103, "Default3", 9250);
		accounts[3]= new Account(104, "Default4", 5000);
		accounts[4]= new Account(105, "Default5", 6070);
	}
	
	void deposit(int accNo,double amount) {
		flag=0;
		for(Account acc: accounts){
			if (accNo==acc.getAccNo()){
				flag++;
				acc.setBalance(acc.getBalance()+amount);
				System.out.println("The updated balance after deposit is "+acc.getBalance() );
			}
		}
		try{
			if(flag==0)
				throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e){
			System.out.println(e.getMessage());
		}
	}

	
	void withdraw(int accNo, double amount){
		flag=0;
		for(Account acc: accounts){
			if (accNo==acc.getAccNo()){
				flag++;
				if(acc.getBalance()>= amount){
					acc.setBalance(acc.getBalance()-amount);
					System.out.println("The updated balance after deposit is "+acc.getBalance() );
				}
				else{	
					try{
					//if(acc.getBalance()<amount)
						throw new InsufficientBalanceException();
					}
					catch(InsufficientBalanceException e){
						System.out.println(e.getMessage());
					}
				}
			}
		}
		try{
			if(flag==0)
				throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	void checkBalance(int accNo){
		flag=0;
		for(Account acc: accounts){
			if (accNo==acc.getAccNo()){
				flag++;		
				System.out.println("The updated balance after deposit is "+acc.getBalance() );
			}
		}
		try{
			if(flag==0)
				throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}
