package Demo;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year to check Leap or Not!");
		int year = in.nextInt();
		
		if (((year % 4 == 0) && (year % 100!= 0)))
			System.out.println(year +"= is leap year");
			
		else if(year%400==0)
		
			System.out.println(year +"= is leap year");
		
		else
			System.out.println(year +"= is not leap year");
		
	}
}

	

