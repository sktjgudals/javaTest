package template;

public class AICar extends Car {
	@Override
	public void wiper() {
		System.out.println("Auto wiper");
	}
	
	@Override
	public void drive() {
		System.out.println("Auto drive");
	}
	
	@Override
	public void stop() {
		System.out.println("stop the AICar");
	}
}

