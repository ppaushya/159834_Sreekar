package Demo7.day.org;

public class Customer {

	String customerId;
	String emailId;
	String mobileNo;
	String customerName;
	
	
	public Customer(String customerId, String emailId, String mobileNo, String customerName) {
		super();
		this.customerId = customerId;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.customerName = customerName;
	}
	public Customer() {
		
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
