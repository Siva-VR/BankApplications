package bank;

public class Address {
	private String hno;
	private String buildingName;
	private String street;
	private String landmark;
	private String district;
	private int pincode;

	

	public Address(String hnum, String buildno, String str, String lndm, String dist, int pin) {
		hno = hnum;
		buildingName = buildno;
		street = str;
		landmark = lndm;
		district = dist;
		pincode = pin;
	}

	public String getHno() {
		return hno;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public String getStreet() {
		return street;
	}

	public String getDistrict() {
		return district;
	}

	public int getPincode() {
		return pincode;
	}
 
	public String toString() {
		return "Address:\nHouseNumber "+getHno()+"\nBuldingName "+getBuildingName()+"\nStreet "+getStreet()+"\nDistrict "+getDistrict()+"\nPinCode"+getPincode();
	}
}
