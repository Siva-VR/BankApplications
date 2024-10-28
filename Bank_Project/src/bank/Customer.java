package bank;

public class Customer {

	private String firstname;
	private String lastName;
	private long phoneNumber;
	private String email;
	private long Id;
	private Address address;
	private Bank bankAccount;	

	public Customer() {
		firstname = "Shiva";
		lastName = "Reddy";
		phoneNumber = 7780291904L;
		email = "gsiva@gmail.com";
		Id = 10100100;
		
	}
	public Customer(String fname, String lname, long phno, String mail, long custid,Address address) {
		firstname = fname;
		lastName = lname;
		phoneNumber = phno;
		email = mail;
		Id = custid;
		this.address= address;
		//this.bankAccount = bankAccount;
	}
	public Bank getBankAccount() {
		return bankAccount;
	}
	public Address getAddress() {
		return address;
	}
	public String getFirstname() {
		return firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public long getId() {
		return Id;
	}

	public String toString() {
		return "Customer_Details:\n" + "FirstName:" + getFirstname() + "\nLastName:" + getLastName() + "\nPhonenumber:"
				+ getPhoneNumber() + "\nEmail_Id:" + getEmail()+"\nAddress"+getAddress()+"\nBankDeTails"+getBankAccount();
	}

}
