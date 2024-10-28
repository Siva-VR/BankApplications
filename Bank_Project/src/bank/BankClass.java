package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankClass {
	private ArrayList<Customer> customers;

	public BankClass() {
		customers = new ArrayList<Customer>();
	}

	public void addCustomer() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the First Name");
			String fname=sc.next();
			System.out.println("Enter the Last Name");
			String lname = sc.next();
			System.out.println("Enter Phone Number");
			long phno = sc.nextLong();
			System.out.println("Enter email");
			String email = sc.next();
			System.out.println("Enter Customer Id");
			long custId = sc.nextLong();
			System.out.println("Enter House Number");
			String hnum=sc.next();
			System.out.println("Enter building Number");
			String buildno = sc.next();
			System.out.println("Enter Street Name");
			String str = sc.next();
			System.out.println("Enter Landmark");
			String landmark = sc.next();
			System.out.println("Enter District");
		    String dist = sc.next();
		    System.out.println("Enter Pincode");
		    int pin = sc.nextInt();			
		    System.out.println("Enter Intial amount to deposit");
		    double balance =sc.nextDouble();
		    Address ad = new Address(hnum,buildno,str,landmark,dist,pin);
		    Bank b = new Bank(balance);
			//Customer c = new Customer(fname,lname,phno,email,custId,ad,b);
			//Bank bankAccount = new Bank(10000);
			//Address ad = new Address("1","","","","",2);
			//Customer ctm = new Customer("Siva","Reddy",7780291904L,"siva@gmail.com",221152,ad,bankAccount);
		
		    //customers.add(c);		
			}

	public void printCustomers() {
		System.out.println(customers);
	}

}
