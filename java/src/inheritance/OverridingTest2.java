package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030,"test",2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.calcPrice(10000));

	}

}
