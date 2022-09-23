package Assignment;

public class NumberOfDigits {

	public static void main(String[] args) {
	int n=123455634;
	int i=0;
	int b=0;
	int count=0;
	while(i<n) {
		b=n%10;
		System.out.println(b);
		n=n/10;
		if(b!=0) {
			count++;
		}
			
	}System.out.println("Number of Digits in given Number " +count);
	}

}
