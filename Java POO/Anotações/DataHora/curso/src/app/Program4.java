package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program4 {
	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);
		
		System.out.println(pastWeek);
		System.out.println(nextWeek);
		
		LocalDateTime pastWeekTime = d05.minusDays(7);
		LocalDateTime nextWeekTime = d05.plusDays(7);
		
		System.out.println(pastWeekTime);
		System.out.println(nextWeekTime);
		
		Duration d1 = Duration.between(pastWeekTime, nextWeekTime);
		
		System.out.println(d1);
	}
}
