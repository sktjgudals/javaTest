package coperation;

public class TakeTrans {
	public static void main(String[] args) {
		
		Student john = new Student("john",5000);
		Student tomas = new Student("tomas",10000);
		
		Bus bus100 = new Bus(100);
		Bus bus101 = new Bus(101);
		john.takeBus(bus101);
		john.takeBus(bus100);
		john.showInfo();
		bus100.showInfo();
		
		Subway subway2 = new Subway("2");
		tomas.takeSubway(subway2);
		tomas.showInfo();
		subway2.showInfo();
	}
}
