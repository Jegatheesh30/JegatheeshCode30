package Assignment;

public class Palindrome {

	public static void main(String[] args) {
		int n=122221;
		int sum;
		int reverse =0;
		int chk=n;
		while(n!=0) {
			sum=n%10;
			reverse=reverse*10+sum;
			n=n/10;
		}
		System.out.print(reverse);	
		
		if(chk==reverse)
			System.out.println(chk+" palindrom");
			else
				System.out.println(chk+ " not palindrom");
	}

}
