package Demo;

public class pattern9 {

	public static void main(String[] args) {
		int n=10;
		int k=1;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" "+k);
				k++;
			}System.out.println();
		}
	}
}
