
public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinutesToYearsDaysCalculator.printYearAndDays(561600);
	}
	
	public static void printYearAndDays(long minutes) {
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}
		
		long yearInMinutes = 525600;
		long years;
		long days;
		String yearAndDays;
	
		years = (long) minutes / (365 * 1440);
		days = (long) (minutes % yearInMinutes);
		
		yearAndDays = minutes +  " min = " + years + " y and " + days + " d";
		
		System.out.println(yearAndDays);
	}
}
