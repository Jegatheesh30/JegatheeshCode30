package Assignment;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a NUmber to check Neon or not! ");
		int n=input.nextInt();
		int n2=n;
		int sum=0;
		int rem=0;
		int square = n*n;
		System.out.println(square);
		while(square>0) 
		{
			rem = square%10;
			System.out.println(rem);
			square = square/10;
			sum= sum+rem;
		} 
		System.out.println("sum of square "+ sum);
		if(sum==n2)
			System.out.println(" the give number is neon number");
		else 
			System.out.println(" the give number is not neon number");
	}
}
