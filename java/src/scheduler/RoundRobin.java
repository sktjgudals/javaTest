package scheduler;

public class RoundRobin implements Scheduler{
	@Override 
	public void getNextCall() {
		System.out.println("Obtain counseling calls from the queue in order");
	}
	
	@Override 
	public void sendCallToAgent() {
		System.out.println("Distribute to the next order of counselors");
	}
}
