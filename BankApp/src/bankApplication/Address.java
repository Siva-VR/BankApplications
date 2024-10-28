package bankApplication;

public class Address {
	private String  houseNumber;
	private String buildingName;
	private String street;
	private String landmark;
	private String district;
	private int pincode;
	
	public Address() {
		houseNumber = "123-221";
		buildingName = "shiva residency";
		street = "siddiqNagar";
		landmark = "Madhapur";
		district = "Hyderabad";
		pincode = 500081;
		
	}
	public Address(String houseNumber, String buildingName, String street, String landmark, String district,
			int pincode) {
		this.houseNumber = houseNumber;
		this.buildingName = buildingName;
		this.street = street;
		this.landmark = landmark;
		this.district = district;
		this.pincode = pincode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingNumber(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", buildingName=" + buildingName + ", street=" + street
				+ ", landmark=" + landmark + ", district=" + district + ", pincode=" + pincode + "]";
	}
	
}
