package Assignment3;

public class FirstTwoBiggestNumber {

	public static void main(String[] args) {
		int a[] = { 43, 6, 8, 2, 10, 14, 33, 20, 12, 73,100};
		int max1 = a[0];
		int b = 0;
		int i = 0;
		int j = 0;
		int c=0;
		int max2 = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max1 = a[i];
				b = i;
			}
		}
		System.out.println("The First Biggest Number In Array =" +max1);
		for (j = 0; j < a.length; j++) {
			if (a[b] != a[j] && a[j] > max2) {
				max2 = a[j];
				c=j;
		}}
		System.out.println("The Second Biggest Number In Array =" +max2);
	}
	}

	
