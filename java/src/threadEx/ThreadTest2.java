package threadEx;

public class ThreadTest2 {

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("1");
		MyThread2 t2 = new MyThread2("2");
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("System over");
	}

}
