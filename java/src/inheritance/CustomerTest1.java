package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
	Customer lee = new Customer();
	lee.setCustomerID(10010);
	lee.setCustomerName("leesin");
	lee.bonusPoint=1000;
	System.out.println(lee.showCustomerInfo());
	VIPCustomer kim = new VIPCustomer();
	kim.setCustomerID(10011);
	kim.setCustomerName("kimminzae");
	kim.bonusPoint=10000;
	System.out.println(kim.showVIPInfo());
	}

}
