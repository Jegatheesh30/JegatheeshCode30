package Assignment;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int i=18;
		int j=34;
		int sum,sum1;
		for(int k=2;k<=j;k++) {
			if(i%k==0&&j%k==0)
				System.out.println(k);
		}
	}
}
