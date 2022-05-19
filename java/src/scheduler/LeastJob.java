package scheduler;

public class LeastJob implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("Obtain counseling calls from the queue in order");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("Assign to counselors who do not currently have or have the least waiting time");
	}
}
