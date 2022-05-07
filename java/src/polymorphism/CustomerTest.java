package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee  = new Customer(100010,"Lee");
		lee.bonusPoint = 1000;
		
		Customer kim = new VIPCustomer(10020,"Kim",1234);
		kim.bonusPoint = 1000;
		
		Customer seo = new GoldCustomer(100030,"Seo");
		seo.bonusPoint = 1000;
		
		customerList.add(kim);
		customerList.add(lee);
		customerList.add(seo);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		int price =10000;
		int leePrice = lee.calcPrice(price);
		int kimPrice = kim.calcPrice(price);
		
//		System.out.println(lee.showCustomerInfo());
//		System.out.println(kim.showCustomerInfo());
//		System.out.println(kimPrice);
//		System.out.println(leePrice);
	}

}
