package Demo;

public class Array2RightRotateWithNestedLoop {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i;
		
		for (int k = 0; k < 4; k++) {
			i = a[a.length - 1];
			for (int t = a.length - 1; t > 0; t--) {
				a[t] = a[t - 1];
			}
			a[0] = i;
		}
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	}
}
