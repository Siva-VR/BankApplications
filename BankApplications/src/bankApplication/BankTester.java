package bankApplication;

import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Address ad = new Address();

		Bank b = new Bank();
		// Customer c = new Customer();
		// b.addCustomer(c);
		// b.printCustomers();
		while (true) {
			System.out.println("<=====Bank Menu=====>\n1.PrintCustomers\n2.Add Customer\n3.Deposit\n4.Withdraw\n5.BalanceEnquity\n0.Exit");
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				// Print customers details
				b.printCustomers();
				break;
			case 2:
				// Add new Customer
				System.out.println("Enter CustomerId");
				int Id = sc.nextInt();
				System.out.println("Enter FirstName");
				String fname = sc.next();
				System.out.println("Enter LastName");
				String lname = sc.next();
				System.out.println("Enter Phone Number");
				long phno = sc.nextLong();
				System.out.println("Enter EmailId");
				String email = sc.next();
				System.out.println("Enter House Number");
				String hno = sc.next();
				System.out.println("Enter BuildingName");
				String buildingName = sc.next();
				System.out.println("Enter Street");
				String street = sc.next();
				System.out.println("Enter LandMark");
				String landmark = sc.next();
				System.out.println("Enter District");
				String district = sc.next();
				System.out.println("Enter Pincode");
				int pincode = sc.nextInt();
				System.out.println("Enter initial deposit amount");
				double balance = sc.nextDouble();
				BankAccount ba = new BankAccount(balance);
				Address ad = new Address(hno, buildingName, street, landmark, district, pincode);
				Customer c = new Customer(Id, fname, lname, phno, email, ad, ba);
				b.addCustomer(c);
				break;
			case 3:
				// Deposit the amount to the customer Bank Account
				System.out.println("Enter Customer Id");
				int custId = sc.nextInt();
				System.out.println("Enter Amount to deposit");
				double amount = sc.nextDouble();
				b.deposit(custId, amount);
				break;
			case 4:
				// WithDraw amount from the customer Account;
				System.out.println("Enter Customer Id");
				 custId = sc.nextInt();
				System.out.println("Enter Amount to withdraw");
				amount = sc.nextDouble();
				b.withdraw(custId, amount);
				break;
			case 5:
				System.out.println("Enter Customer Id");
				 custId = sc.nextInt();
				 b.balanceEnquiry(custId);
				break;
			case 0:
				// Exit from the menu
				System.exit(0);
			default:
				// Invalid option
				System.out.println("Please enter valid option");
			}
		}
	}

}
