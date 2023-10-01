package ch21;

public class ObjectCopy2 {

	public static void main(String[] args) {
		//깊은 복사: 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함
		Book[] library = new Book[5];
		Book[] copy = new Book[5];
		
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		copy[0] = new Book();
		copy[1] = new Book();
		copy[2] = new Book();
		copy[3] = new Book();
		copy[4] = new Book();
		
		for(int i = 0;i<library.length;i++) {
			copy[i].setTitle(library[i].getTitle());
			copy[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
		System.out.println("==================");
		for(Book book:copy) {
			System.out.println(book);
			book.showInfo();
		}
		
	}
}