
public class pattern6 {
	
	void pattern(int n) {
		int i=1;
		int j=1;
		int k=1;
		int alphabet =64;
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(" "+(char)(alphabet+k));
			}System.out.println();
			}
		
	}
	
	public static void main(String[] args) {
		pattern6 obj=new pattern6();
		obj.pattern(5);
		}
	}
	


