
public class pattern2 {

	void pattern(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i);
			}System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		pattern2 obj=new pattern2();
		obj.pattern(5);

	}

}
