package inheritance;

public class Customer {
	protected int customerID;	
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer () {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName+ "sir " + customerGrade + " point is " +bonusPoint;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID =customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void getCustomerName(String name) {
		this.customerName =name;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade=customerGrade;
	}
	
}

