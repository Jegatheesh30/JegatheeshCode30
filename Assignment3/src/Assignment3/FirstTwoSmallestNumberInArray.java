package Assignment3;

public class FirstTwoSmallestNumberInArray {

	public static void main(String[] args) {
		int a[] = { 43, 6, 8, 2, 10, 14, 33, 20, 12, 73,100};
		int min1 = a[0];
		int b = 0;
		int i = 0;
		int j = 0;
		int c=0;
		int min2 = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] < min1) {
				min1 = a[i];
				b = i;
			}
		}
		System.out.println("The First Smallest Number In Array =" +min1);
		a[b]=0;
		min2=a[0];
		for (j = 0; j < a.length; j++) {
				if (a[j]!=a[b]&&a[j]<min2) {
					min2 = a[j];
					c = j;
		}
		}System.out.println("The second Smallest Number In Array = "+min2);
	}
}