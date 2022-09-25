package Assignment;

public class StrongNumber {

	public static void main(String[] args) {
		int n=145;
		int rem;
		int n2=n;
		int i,fact;
		int sum=0;
		System.out.println(n);
		while(n>0) {
			fact = 1;
			i=1;	
			rem=n%10;
			while(i<=rem) {
				fact=fact*i;
				i++;
			}
			System.out.println("the factorial of " + rem + " = " + fact);
			sum=sum+fact;
			System.out.println(" The sum of factorial is " + sum);
			n=n/10;	
		}
		if(sum==n)
			System.out.println(" the given number is strong number");
		else
			System.out.println(" the give number is not strong number");
	}
}
		
		