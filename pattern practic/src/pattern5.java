
public class pattern5 {
	
	void pattern(int n) {
		int i=1;
		int j=1;
		int alphabet=65;
		for(i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print((char) (alphabet+i));
			}System.out.println();
		}

	}

	public static void main(String[] args) {
		pattern5 obj=new pattern5();
		obj.pattern(5);

	}

}
