package coperation;

public class Subway {
	
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take (int money) {
		this.money=money;
		passengerCount ++;
	}
	public void showInfo() {
		System.out.println("line Num is "+lineNumber +"subwaycount"+passengerCount+"money is "+money);
	}
}
