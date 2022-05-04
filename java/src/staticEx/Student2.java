package staticEx;

public class Student2 {
	private static int serialNum = 900;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2 () {
		serialNum++;
		studentID =serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;	
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum =serialNum;
	}
}
