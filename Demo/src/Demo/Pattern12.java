package Demo;

public class Pattern12 {

	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				if (j == 1 || j == i)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		n = 9;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				if (j == 1 || j == n || j == i)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
