import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {


	System.out.println("Enter the day of week: \n");
	Scanner sc = new Scanner(System.in);
	String dayOfWeek = sc.nextLine();
	EvaluateDayOfWeek(dayOfWeek);
	sc.close();
	
}
//call the method in main method
	public static void EvaluateDayOfWeek(String dayOfWeek)
	{
		if (dayOfWeek != null)
		{
			if (!dayOfWeek.isEmpty())
			{
				if (dayOfWeek.equalsIgnoreCase("monday") ||
					dayOfWeek.equalsIgnoreCase("tuesday") ||
					dayOfWeek.equalsIgnoreCase("wednesday") ||
					dayOfWeek.equalsIgnoreCase("thursday") ||
					dayOfWeek.equalsIgnoreCase("friday"))
				{
					System.out.println(dayOfWeek + " is a weekday!");
				}
				else if (dayOfWeek.equalsIgnoreCase("saturday") ||
						 dayOfWeek.equalsIgnoreCase("sunday"))
						{
							System.out.println(dayOfWeek + " is a weekend day!");
						}
				else
				{
					System.out.println(dayOfWeek + " is not a valid day");
				}
			}
			else
			{
				System.out.println("Day of week is an empty string!!");
			}
		}
		else
		{
			System.out.println("You have given me a null string!!");
		}
}
}
