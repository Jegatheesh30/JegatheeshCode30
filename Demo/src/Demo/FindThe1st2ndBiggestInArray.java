package Demo;

public class FindThe1st2ndBiggestInArray {

	public static void main(String[] args) {
		int a[] = { 43, 6, 8, 2, 10, 14, 33, 20, 12, 73,100,100};
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
		System.out.println(max1);
		System.out.println("position is " + b);
		for (j = 0; j < a.length; j++) {
			if (a[b] != a[j] && a[j] > max2) {
				max2 = a[j];
				c=j;
		}}
		System.out.println(max2);
		System.out.println(" position is "+ c);
	}
}
