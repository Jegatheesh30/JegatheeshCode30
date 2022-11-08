package String;
import java.util.Scanner;


public class Decimal {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the decimal value");
		int decimal =input.nextInt();
		String binary = "";
		int rem;
		while(decimal>0) {
			rem=decimal%2;
			binary=binary+""+rem;
			decimal/=2;
		}
		System.out.println(binary);
	}
	

}
