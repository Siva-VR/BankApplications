package bankApplication;

public class BankAccount {
	
	private long id =203000;
	private double balance;
	 
	private static int accountCount;
	
	public BankAccount() {
		balance = 1000;
		id = id+(++accountCount);
	}

	public BankAccount(double balance) {
		this.id = ++accountCount;
		this.balance = balance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Amount Deposited successfully");
	}
	public void withdraw(double amount) {
		if(amount<0) {
			System.out.println("Error:Negative amount, Withdraw cannot possible");
		}
		else if(amount>balance) {
			System.out.println("Insufficient balance to withdraw the entered amount");
		}else {
			balance = balance - amount;
			System.out.println("Amount withdraw successfully");
		}
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", balance=" + balance + "]";
	}
	
	
}
