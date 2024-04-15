package travelsDemo;

public class User {
		public String firstName;
		public String lastName;
		public String mobileNumber;
		public String gender;
		public String email_Id;
		public String password;
		public String failedCount;
		public String accountStatus;
		public User(String firstName, String lastName, String mobileNumber, String gender, String email_Id,
				String password) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.mobileNumber = mobileNumber;
			this.gender = gender;
			this.email_Id = email_Id;
			this.password = password;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail_Id() {
			return email_Id;
		}
		public void setEmail_Id(String email_Id) {
			this.email_Id = email_Id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		@Override
		public String toString() {
			return "User [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
					+ ", gender=" + gender + ", email_Id=" + email_Id + ", password=" + password + "]";
		}
		
		
}


