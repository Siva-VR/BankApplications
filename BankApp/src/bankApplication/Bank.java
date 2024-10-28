package bankApplication;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Customer> customers;
	public Bank() {  
	customers = new ArrayList<Customer>();
	}
	
	
	public void printCustomers() {
		// TODO Auto-generated method stub
		for(int i =0;i<customers.size();i++) {
			customers.get(i).PrintDetails();
		}
	}
	public void addCustomer(Customer c) {
		customers.add(c);
		System.out.println("Customer Added Successfully");
	}
	public void deposit(int custId,double amount) {
		boolean found = false;
		for(Customer c:customers) {
			if(c.getId()==custId) {
				c.getAccount().deposit(amount);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Customer Not Found");
		}

	}
	public void withdraw(int custId,double amount) {
		boolean found = false;
		for(Customer c:customers) {
			if(c.getId()==custId) {
				c.getAccount().withdraw(amount);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Customer Not Found");
		}

	}
	public void balanceEnquiry(int custId) {
		boolean found = false;
		for(Customer c:customers) {
			if(c.getId()==custId) {
				System.out.println("Current Balance"+c.getAccount().getBalance());
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Customer Not Found");
		}

	}

	

	
	
}
