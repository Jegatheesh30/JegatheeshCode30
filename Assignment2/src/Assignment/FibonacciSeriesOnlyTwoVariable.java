package Assignment;

public class FibonacciSeriesOnlyTwoVariable {

	public static void main(String[] args) {
		int f=-1;
		int s=1;
		for(int i=0;i<10;i++) {
			
			System.out.println(f+s);
			s=f+s;
			f=s-f;	
		}
	}
}
