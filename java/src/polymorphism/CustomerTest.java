package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer lee  = new Customer(100010,"Lee");
		lee.bonusPoint = 1000;
		
		Customer kim = new VIPCustomer(10020,"Kim",1234);
		kim.bonusPoint = 1000;
		
		int price =10000;
		int leePrice = lee.calcPrice(price);
		int kimPrice = kim.calcPrice(price);
		
		System.out.println(lee.showCustomerInfo());
		System.out.println(kim.showCustomerInfo());
		System.out.println(kimPrice);
		System.out.println(leePrice);
	}

}
