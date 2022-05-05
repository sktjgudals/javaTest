package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;

	public VIPCustomer () {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio =0.1;
		System.out.println("VIP class call");
	}
	
	public VIPCustomer(int customerID,String customerName,int agentID) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID =agentID;
		System.out.println("VIP constructor call");
	}

	//Source ->  Override
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
//	Annotation
//	@Override
//	public int calcPrice(int price) {
//		return super.calcPrice(price);
//	}

	public int getAgentID() {
		return agentID;
	};
	
	public String showVIPInfo() {
		return super.showCustomerInfo()+ " agent is "+ agentID;
	}
	
}
