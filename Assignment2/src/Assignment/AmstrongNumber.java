package Assignment;

public class AmstrongNumber {

	public static void main(String[] args) {

	int num=370;
		int b=num;
		int i=0;
		int rem;
		int result =0;
		while(i<num) {
			rem=num%10;
			result+=Math.pow(rem,3);
			System.out.println(result);
			num=num/10;
		}
		if(result==b)
			System.out.println(b+ " is an Amstrong Number");
		else
			System.out.println(b + " is not an Amstrong Number");
	}

}