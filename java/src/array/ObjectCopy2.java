package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book [] bookArray = new Book[3];
		Book [] bookArray2 =new Book[3];
		
		bookArray[0] = new Book("demian","herman");
		bookArray[1] = new Book("test1","test1");
		bookArray[2] = new Book("test2","test2");
		for (int i =0;bookArray.length > i;i++) {
		bookArray2[i] =new Book(bookArray[i].getBookName(),bookArray[i].getAuthor());
//		bookArray2[i].setBookName(bookArray[i].getBookName());
//		bookArray2[i].setAuthor(bookArray[i].getAuthor());
		}
		
		for (int i =0; i< bookArray2.length; i++) {
		bookArray2[i].showBookInfo();	
		}
		bookArray[0].setBookName("test111");
		for (int i =0; i< bookArray2.length; i++) {
			bookArray[i].showBookInfo();
			bookArray2[i].showBookInfo();	
			}
	}
}
