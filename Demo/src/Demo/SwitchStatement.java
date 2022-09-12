package Demo;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a day");
		int n = input.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("weekdays");
			break;
		case 2:
			System.out.println("weekdays");
			break;
		case 3:
			System.out.println("weekdays");
			break;
		case 4:
			System.out.println("weekdays");
			break;
		case 5:
			System.out.println("weekdays");
			break;
		case 6:
			System.out.println("week end");
			break;
		case 7:
			System.out.println("week end");
			break;
		default:
			System.out.println("Error!");
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
