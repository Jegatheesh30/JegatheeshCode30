package Demo;

public class SumOfdigits {

	// count the digit

	public static void main(String[] args) {
		int a = 7589;
		int j, m, k = 0;
		int d = 0;
		while (a > 0) {
			j = a % 10;
			//System.out.println(j);
			a = a / 10;
			k = k + j;
			System.out.println(k);

			if (k > 10) {
				m = k % 10;
				d= k / 10;
				
				k=d+m;
				System.out.println(k);
			}
		}
		System.out.println(k);
	}
}
