import java.time.*;
import java.time.temporal.*;

public class CustomDate {
	
	private int month;
	private int day;
	private int year;
	
	public CustomDate(int month, int day, int year){
		LocalDate date = LocalDate.of(year, month, day);
		
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	private LocalDate toLocalDate(){
		return LocalDate.of(year, month, day);
	}
	
	public long daysBetween(CustomDate x){
		return Math.abs(ChronoUnit.DAYS.between(this.toLocalDate(), x.toLocalDate()));
	}
	
	public String dayOfWeek(){
		DayOfWeek weekday = toLocalDate().getDayOfWeek();
		return weekday.toString();
	}
	
	public boolean isLeap(){
		return toLocalDate().isLeapYear();
	}
	
	
	@Override
	public String toString(){
		return String.format("%02d/%02d/%04d", month, day, year);
	}
	
	public static void main (String[] args) {
		CustomDate d1 = new CustomDate(10, 18, 2026);
		CustomDate d2 = new CustomDate(12, 24, 2026);
		
		System.out.println("Date: " + d1);
		
		System.out.println("Days between " + d1 + " and " + d2 + ": " + d1.daysBetween(d2) + " Days");
		System.out.println(d1 + " is a " + d1.dayOfWeek());
		System.out.println("is " + d2 + " during a leap year: " + d2.isLeap());
		
	}
}

