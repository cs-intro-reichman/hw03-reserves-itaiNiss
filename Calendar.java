/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int speciaSUNDAY = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
		int selectedYear = Integer.parseInt(args[0]);
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (true) 
		{
	 		//// Write the body of the while 
			//System.out.print(dayOfMonth + "/");
			//System.out.print(month + "/");
			//System.out.print(year);
			//if(dayOfWeek == 1)
			//{
			//	System.out.print(" Sunday");
		//	}
		//	System.out.println();

	 		advance();
			if (year > selectedYear) 
			{
				break;
			}
			while (selectedYear == year) 
			{
				System.out.print(dayOfMonth + "/");
				System.out.print(month + "/");
				System.out.print(year);
				if(dayOfWeek == 1)
				{
					System.out.print(" Sunday");
				}
				System.out.println();
				advance();
			}
			
	 		
	 		
		}
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		// Replace this comment with your code
		dayOfWeek %= 7;
		dayOfWeek++;
		if(dayOfMonth < nDaysInMonth)
		{
			dayOfMonth++;
		}
		else
		{
			dayOfMonth = 1;
			month++;
			nDaysInMonth = nDaysInMonth(month, year);
			if (dayOfWeek == 1)
			{
				speciaSUNDAY++;
			}
			if (month > 12) 
			{
				month = 1;
				year++;
				nDaysInMonth = nDaysInMonth(month, year);
			}
		}
	 } 
		 
	 public static boolean isLeapYear(int year) {
	    // Replace the following statement with your code
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			return true;
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		if (month >= 8) 
		{
			if (month % 2 == 0) 
			{
				return 31;
			}
			else
			{
				return 30;
			}
		}
		else
		{
			if (month == 2) 
			{
				if (isLeapYear(year) == true) 
				{
					return 29;	
				}
				else
				{
					return 28;
				}
			}
			else 
			{
				if (month % 2 == 0)
				{
					return 30;
				}
				else
				{
					return 31;
				}
			}
		}
	}
}