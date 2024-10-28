package bankApplication;

public class Customer {
	private int id = 1001100000;
	private String fname;
	private String lname;
	private long phno;
	private String email;
	private Address address;
	private BankAccount account;


	private static int count;

	public Customer() {
		++count;
		id += count;
		fname = "shiva";
		lname = "Reddy";
		phno = 7780291904L;
		email = "sivareddy@gmail.com";
		address = new Address();
		account = new BankAccount();
	}
	

	public Customer(int id, String fname, String lname, long phno, String email, Address address, BankAccount account) {
		id = ++count;
		this.fname = fname;
		this.lname = lname;
		this.phno = phno;
		this.email = email;
		this.address = address;
		this.account = account;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	public void PrintDetails() {
		System.out.println("Customer Id:"+id);
		System.out.println("Customer Name:"+fname+""+lname);
		System.out.println("Customer Phone Number:"+phno);
		System.out.println("Customer Email:"+email);
		System.out.println("Customer Address:");
		System.out.println("Customer HouseNumber:"+address.getHouseNumber());
		System.out.println("Customer BuildingName:"+address.getBuildingName());
		System.out.println("Customer Street:"+address.getStreet());
		System.out.println("Customer Landmark:"+address.getLandmark());
		System.out.println("Customer District:"+address.getDistrict());
		System.out.println("Customer Pincode:"+address.getPincode());
		System.out.println("Customer Accountnumber:"+account.getId());
		System.out.println("Customer Balance:"+account.getBalance());
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}
	

	@Override
	public String toString() {
		return "Customer [firstname=" + fname + ", lastname=" + lname + ", phoneNumber=" + phno + ", email=" + email
				+ ", "+ address +", "+account+ "]";
	}

}
