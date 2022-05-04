package array;

public class ObjectCopy {
	public static void main(String[] args) {
		Book [] bookArray = new Book[3];
		Book [] bookArray2 =new Book[3];
		
		bookArray[0] = new Book("demian","herman");
		bookArray[1] = new Book("test1","test1");
		bookArray[2] = new Book("test2","test2");
		System.arraycopy(bookArray, 0, bookArray2, 0, 3);
		for (int i =0;bookArray2.length > i;i++) {
		bookArray2[i].showBookInfo();
		}
		bookArray[0].setBookName("test33");
		bookArray[0].setAuthor("test33");
		
		for (int i =0; i< bookArray2.length; i++) {
		bookArray2[i].showBookInfo();	
		}
	}

}
