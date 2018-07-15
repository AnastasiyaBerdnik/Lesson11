package anastasiya.lesson11.home.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import anastasiya.lesson10.home.task.Book;

public class MainList {
	public static void main(String[] args) {
		List<Book> list = new ArrayList <Book>();
		Book book = new Book ("Poetryr", "Esenin", 1989, 77, "RUS", 88.77);
		list.add(book);
		
		book  = new Book ("Novels", "Kipling", 2005, 555, "ENG", 22.77);
		list.add(book);
		
		book = new Book ("EveryDay English", "Suhoruk", 21989, 345, "RUS", 777);
		list.add(book);
		
		book = new Book ("Novels", "Pushkin", 1988, 88, "RUS", 767);
		list.add(book);
		
		book = new Book ("Onegin", "Pushkin",  1989, 77,
				"RUS", 88.99);
		list.add(book);
		
		book = new Book ("Jungles", "Kipling", 2000, 76,
				"RUS", 101.11);
		list.add(book);
		
		book = new Book ("Romeo", "Schekspir",  1980, 822,
				"RUS", 88);
		list.add(book);
		
		book = new Book ("JAVA ", "Kerre",  1567, 5,
				"RUS", 10500);
		list.add(book);
		
		Set<Book> result = findByTitle(list, "Onegin");
		for(Book bookFromResult : result) {
			System.out.println("" + bookFromResult.getPrice() + "-" + bookFromResult.getYear());

		
	}

}

	
	public static Set<Book> findByTitle(List<Book> list, String title) {
		Set<Book> sortedBooks = new TreeSet<Book>(new ComparatorofYearAndPrice()); 
		
		for(Book book : sortedBooks) {
			
			if (book.getTitle().equals(title)) {
				sortedBooks.add(book);
			
			} 
		}
		
		return sortedBooks; 
}
}
