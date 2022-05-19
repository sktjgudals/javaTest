package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("a counseling system");
		System.out.println("R: One by one.");
		System.out.println("L: the least-anticipated way");
		System.out.println("P: vip method");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if (ch == 'L'|| ch == 'l') {
			scheduler = new LeastJob();
		}
		else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("Error");
			return ;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
