package staticEx;

public class Student {
	public static int serialNum = 900;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student () {
		serialNum++;
		studentID =serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}
