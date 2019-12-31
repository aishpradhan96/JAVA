package accountassgn;

public class Account {
	private int accNo;
	private String custName;
	private double balance;
	public Account(){
	}
	public Account(int accNo, String custName, double balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}


