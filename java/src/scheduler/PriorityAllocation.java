package scheduler;

public class PriorityAllocation implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("Get calls from customers with high customer ratings first");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("Priority distribution to counselors with high work skill values");
	}
}
