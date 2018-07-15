package anastasiya.lesson10.home.task;

import java.util.Comparator;

import anastasiya.lesson10.home.task.Book;

public class CompareByYearAndPrice implements Comparator <Book>{
	
	public int compare(Book first, Book second) {
		double firstPrice = first.getPrice();
		double seconPrice = second.getPrice();
		
		int firstYear = first.getYear();
		int secondYear = second.getYear();
		
		if(firstPrice < seconPrice) {
			return -1;
			
		} else if (firstPrice > seconPrice) {
			return 1;
		} else {
			
			if (firstYear < secondYear) {
				return -1;
			} else if (firstYear > secondYear) {
				return 1;
			} else {
				return 0;
			}
	
		}
	
	}	
	


}
