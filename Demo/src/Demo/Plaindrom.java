package Demo;
import java.util.Scanner;


public class WhileLoop {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter an integer");
		int num=in.nextInt();
		int reverse =0;
		int check=num;
		while(num>0)
			
		{
			int r=num%10;
			reverse=(reverse*10)+r;
			num=num/10;
		}
		System.out.print(reverse);
		if(reverse==check)
			System.out.println("= palindrom");
		else
			System.out.println("= not palindrom");
	}
	
}
