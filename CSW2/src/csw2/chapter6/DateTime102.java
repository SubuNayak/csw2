package csw2.chapter6;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime102 {

	public static void main(String[] args) {

		// Format a date ISO8601-like but with slashes instead of dashes
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/LL/dd");
		System.out.println(df.format(LocalDate.now()));
		
		// Parse a String to a date using the same formatter
		System.out.println(LocalDate.parse("2014/04/01", df)); // parses any given date format to default date format
		
		// Format a Date and Time without timezone information
		DateTimeFormatter nTZ = DateTimeFormatter.ofPattern("d MMMM, yyyy W h:mm a");
		System.out.println(ZonedDateTime.now().format(nTZ));
	}

}
