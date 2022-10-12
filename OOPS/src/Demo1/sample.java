package Demo1;

public class sample {
	private static int getsquare(int x) {
		return x*x;
	}
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int sales=getsquare(i);
			System.out.println("square of "+i+" is: "+ sales);
		}
	}
}


