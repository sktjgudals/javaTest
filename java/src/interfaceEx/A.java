package interfaceEx;

public interface A {
	default void someMethod() {
		System.out.println("A");
	}
}
