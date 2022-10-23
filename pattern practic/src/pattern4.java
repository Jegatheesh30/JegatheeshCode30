
public class pattern4 {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		int n=5;
		int alphabet=65;
		for(i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print((char) (alphabet+j));
			}System.out.println();
		}

	}

}
