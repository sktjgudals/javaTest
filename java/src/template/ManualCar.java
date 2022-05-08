package template;

public class ManualCar extends Car {
	
	@Override
	public void wiper() {
		System.out.println("normal wiper");
	}
	
	@Override
	public void drive() {
		System.out.println("Drive the Car");
	}
	
	@Override
	public void stop() {
		System.out.println("stop the Car");
	}
}
