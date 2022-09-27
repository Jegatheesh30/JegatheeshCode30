package Assignment3;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int x = 100;
		for (int i = 0; i < a.length; i++) {
			if (x == a[i])
				System.out.println(a[i]);
		}
	}
}
