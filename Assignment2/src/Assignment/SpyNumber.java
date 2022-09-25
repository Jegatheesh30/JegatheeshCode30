package Assignment;
import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Number to check Neon or not!");
		int n= input.nextInt();
		int sum = 0, multi = 0;
		int sum1 = 1, rem = 0;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + rem;
			sum1 = sum1 * rem;
		}
		System.out.println("The sum of the given Number is" + sum);
		System.out.println("The product of the give Number is " + sum1);
		if (sum == sum1)
			System.out.println("The given number is Neon Number");
		else
			System.out.println(" The give number is Not Neon Number");

	}

}
