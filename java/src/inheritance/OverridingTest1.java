package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		
		Customer lee = new Customer(10010,"Lee");
		lee.bonusPoint = 1000;
		
		VIPCustomer seo = new VIPCustomer(10020,"Seo",12345);
		seo.bonusPoint = 10000;
		
		int price = 10000;
		
		System.out.println(lee.calcPrice(price));
		System.out.println(seo.calcPrice(price));
	}

}
