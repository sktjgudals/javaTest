package array;

public class BookArray {

	public static void main(String[] args) {
		Book [] library = new Book[5];
		System.out.println(library.length);
		for(int i=0; library.length > i; i++) {
			library[i] = new Book("book"+ i, "author"+i);
			library[i].showBookInfo();
		}
	}

}
