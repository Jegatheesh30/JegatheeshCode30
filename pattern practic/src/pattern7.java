
public class  pattern7 {
	
	public static void main(String[] args) {
		int i=1;
		int j=1;
		int k=1;
		int n=5;
		int alphabet =64;
		for(i=1;i<=n;i++) {
			int q=5;
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(" "+q--);
			}System.out.println();
			}
	}

}
