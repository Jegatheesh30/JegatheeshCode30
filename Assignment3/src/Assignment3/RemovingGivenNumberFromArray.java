package Assignment3;

public class RemovingGivenNumberFromArray {

	public static void main(String[] args) {
		int a[] = { 1, 8, 7, 5, 4, 6, 9 };
		int x = 5;
		for (int i = 0; i < a.length; i++) {
			if (x == a[i]) 
			{
				continue;
			}
			System.out.print(a[i]);
		}
	}
}
