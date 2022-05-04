package coperation;

public class Student {
 public String studentName;
 public int grade; 
 public int money;
 
 public Student(String studentName, int money) {
	 this.studentName =studentName;
	 this.money = money;
	 return ;
 }
 
 public void takeBus (Bus bus) {
	 if(bus.busNumber==100) {
		 bus.take(2000);
		 this.money -= 2000;
	 }else {
		 bus.take(1000);
		 this.money -= 1000;
	 }
 }
 
 public void takeSubway(Subway subway) {
	subway.take(1500);
	this.money -= 1500;
 }
 public void showInfo() { 
	 System.out.println(studentName+" "+money);
 }
}
