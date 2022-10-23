
public class sandglassstarpattern {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int k = 0;
		int n = 7;
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (k = i; k <= n; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (i = 0; i <= n; i++) {
			for (j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
