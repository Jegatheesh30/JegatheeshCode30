
public class pattern1 {
	
	void pattern(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j);
			}System.out.println();
		}
		
	}

public static void main(String [] args) {
	pattern1 obj = new pattern1();
	obj.pattern(5);
}
	
}
