package accountassgn;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(){
		super("Balance is insuficient.");
	}

}
