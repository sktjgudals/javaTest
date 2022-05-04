package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company a = Company.getInstance();
		Company b = Company.getInstance();
		System.out.println(a);
		System.out.println(b);

	}

}
