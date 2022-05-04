package staticEx;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentSeo = new Student();
		studentSeo.setStudentName("SeoHyungmin");
		System.out.println(studentSeo.getStudentName());
		System.out.println(studentSeo.serialNum);
		Student studentSon = new Student();
		studentSon.setStudentName("SonHyungmin");
		System.out.println(studentSeo.serialNum);
	}

}
