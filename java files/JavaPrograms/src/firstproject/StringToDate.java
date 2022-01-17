package firstproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StringToDate {

	public static void main(String[] args) {
		
		String str="June 27, 2003";
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date=LocalDate.parse(str, format);
		System.out.print(date);
		
		
	}
}
