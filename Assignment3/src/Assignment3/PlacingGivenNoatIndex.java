package Assignment3;

public class PlacingGivenNoatIndex {

	public static void main(String[] args) {
		int a[] = { 1, 8, 7, 5, 4, 6, 9 };
		int x = 13;
		int i = a.length - 1;
		a[i] = 13;
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
