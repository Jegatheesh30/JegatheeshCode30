package Assignment;

public class PrimeNumberInfibonacciseries {

	public static void main(String[] args) {
		int n1 = -1;
		int n2 = 1;
		int n3 = 0;
		int j = 0;
		int i, chk;
		int e = 0;// use this variable to find the sum value of fibonacci series;
		{
		for (i = 0; i < 10; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			chk = 0;
			for (j = 2; j < i; j++) {
				if (n3 % j == 0) {
					chk++;
					break;
				}
			}
			if (chk == 0) {
				System.out.println(n3);
			}
		}
		
	}
	}}
