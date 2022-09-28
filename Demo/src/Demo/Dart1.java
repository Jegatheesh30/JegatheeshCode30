package Demo;
import java.util.Scanner;
public class Dart1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Money");
		int n=input.nextInt();
		if(n>500)
		{
		int a=500;
		int b=200;
		int c=100;
		int m=n/a;
		System.out.println(m);
		int k=m*a;
		int o=n-k;
		int l=o/b;
		int i=o%b;
		System.out.println(l);
		int j=i/c;
		System.out.println(j);
		}
		else 
			System.out.println("ivalid amount enter above 500");
		}
	}


