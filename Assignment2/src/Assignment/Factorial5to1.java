package Assignment;

public class Factorial5to1 {

	public static void main(String[] args) {
		int a=5;
		int i;
		for(i=5;i>=1;i--) {
			a=1;
			for(int j=1;j<=i;j++) {
				a=a*j;
				
			}
			System.out.println(a);
		}
	}
    }
