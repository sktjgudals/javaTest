package interfaceEx;

public interface B extends A{
	@Override
	default void someMethod() {
		System.out.println("B");
	}
}
