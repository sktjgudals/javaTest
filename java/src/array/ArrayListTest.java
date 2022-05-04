package array;
import java.util.ArrayList;

public class ArrayListTest {
	
	public static void bookCreate(String name , String author) {
		Book book = new Book(name,author);
		System.out.println(book.getAuthor());
		return ;
	}

	public static void main(String[] args) {
		ArrayList<Book> library= new ArrayList<Book>();
//	 	bookCreate("test2","test3");
	 	for (int i =0; i< 4 ; i++) {
	 		library.add(new Book( "test"+i,"test"+i));
	 	Book book=	library.get(i);
	 	book.showBookInfo();	 	
	 	}

	}

}
