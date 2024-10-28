package bank;

public class Bank {
	private long id;
	private double balance;
	static long accountCount=100110000;
	
	
	
	public Bank(double balance){
		this.balance = balance;
		accountCount++;
		id +=accountCount;
	}

	public long getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public static long getAccountCount() {
		return accountCount;
	}
	public void deposit(double amount){
		this.balance = balance+amount;
		System.out.println("Successfully deposited");
	}
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("insufficient amount to withdraw");
		}else {
			this.balance=balance-amount;
			System.out.println("withdraw sucessfull current balance"+balance);
		}
	}
	
	
	public String toString() {
		return "BankAccount[accNo="+getId()+"\nBalance"+getBalance();
	}
	
	
	
}
