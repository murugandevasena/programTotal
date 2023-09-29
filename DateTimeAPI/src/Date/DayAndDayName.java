package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class DayAndDayName {
	    public static void main(String[] args) {
	        // Define the date formatter
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        // Create a stream of dates starting from today
	        LocalDate today = LocalDate.now();
	        Stream<LocalDate> dateStream = Stream.iterate(today, date -> date.plusDays(2));
	        // Get the day name for today and the next day
	        dateStream.limit(2)  // Limit the stream to 2 elements (today and the next day)
	                .forEach(date -> {
	                    String dayName = date.getDayOfWeek().toString();
	                    System.out.println("Date: " + date.format(formatter) + ", Day Name: " + dayName);
	                });
	    }
}
