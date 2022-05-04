package staticEx;

public class StudentTest2 {

	public static void main(String[] args) {	
		for(int i=0; i<10; i ++) {
				Student2 student= new Student2();
				student.setStudentName("student"+i);
				System.out.println(student.getSerialNum());
		}

	}

}
