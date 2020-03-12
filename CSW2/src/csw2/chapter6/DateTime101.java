package csw2.chapter6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime101 {

	public static void main(String[] args) {

		LocalDate dNow = LocalDate.now();
		System.out.println(dNow);
		
		// Date after subtraction of given no. of days from current date
		LocalDate y = dNow.minusDays(1);
		System.out.println(y);
		
		LocalTime tNow = LocalTime.now();
		System.out.println(tNow);
		
		// To get current minute of the hour
		int t = tNow.getMinute();
		System.out.println(t);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		ZoneId currentId = ZoneId.systemDefault();
		System.out.println(currentId);
		
		ZoneId Id = ZoneId.of("Asia/Kolkata");
		System.out.println(Id);
		
		ZonedDateTime dt = ZonedDateTime.now();
		System.out.println(dt);
		
	}

}
