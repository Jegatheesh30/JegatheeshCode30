package Assignment;
import java.util.Scanner;

public class JavaPerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number?");
		int n=sc.nextInt();
		int b=0;
		int i=0;
		for(i=1;i<n;i++) {
			if(n%i==0)
			System.out.println(i);
			
		}	b=b+i;
		System.out.println(b);
		if(b==n)
			System.out.println(n + " is perfect Number");
		else
			System.out.println(n+ " is not perfect Number");
		}
	}


