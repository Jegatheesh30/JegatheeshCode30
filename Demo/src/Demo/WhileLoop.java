package Demo;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter an long number");
		long num=in.nextLong();
		while (num>0)
		{
			long r=num%10;
			System.out.println(r);
			num=num/10;
		}
		
	}
}
