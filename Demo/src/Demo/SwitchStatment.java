package Demo;
import java.util.Scanner;

public class SwitchStatment {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter an value to choose menu");
		int expression = in.nextInt();
		
		switch (expression){
		
		case 1:
			System.out.println("insert your card");
			break;
		case 2:
			System.out.println("enter your pin number");
			break;
		case 3:
			System.out.println("select menu for with draw");
			break;
		case 4:
			System.out.println("enter an amount to withdraw");
			break;
		default:
			System.out.println("cancel the transaction");
		
		}

	}
}
