package Parallelproject.org.caape;

public class Address {


	private String streetName;
	private String addressLine;
	private String city;
	private String state;
	
	public Address(String string, String string2, String string3, String string4) {
		
	}
	
	public Address(String streetName, String addressLine, String city, String state) {
		super();
		this.streetName = streetName;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", addressLine=" + addressLine + ", city=" + city + ", state="
				+ state + "]";
	}
	
	
	

}

}
