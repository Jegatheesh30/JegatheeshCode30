package Demo;

public class Pattern11 {

	public static void main(String[] args) {
		int a = 5;
		int b;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				if (i == 0 || i == 5) {
					b = i < a / 2 ? j : a - j;
					System.out.print(b + " ");
				} else if (j == 0 || j == 5) {
					b = j < a / 2 ? i : a - i;
					System.out.print(b + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
