package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student seo= new Student(1000,"SeoHyungmin");
		seo.addSubject("korean",70);
		seo.addSubject("math",60);
		
		Student kim= new Student(1000,"SeoHyungmin");
		kim.addSubject("korean",70);
		kim.addSubject("math",100);
		
		
		seo.showStudentInfo();
		kim.showStudentInfo();
	}
}
