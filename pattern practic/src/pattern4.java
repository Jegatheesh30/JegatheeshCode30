
public class pattern4 {
	
	void pattern(int n) {
		int i=1;
		int j=1;
		int alphabet=65;
		for(i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print((char) (alphabet+j));
			}System.out.println();
		}

	}

	public static void main(String[] args) {
		pattern4 obj=new pattern4();
		obj.pattern(5);
	}

}
