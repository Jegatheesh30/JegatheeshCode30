package Assignment3;

public class PrintingArrayInReverseOrder {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i = 9;
		for (i = a.length - 1; i >= 0; i--) 
		{
			System.out.println(a[i]);
		}
	}
}
