
public class pattern3 {
	
	void pattern(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" "+k);
			}System.out.println();
		}
		
	}

public static void main(String[] args) {
	pattern3 obj=new pattern3();
	obj.pattern(5);
}

}
