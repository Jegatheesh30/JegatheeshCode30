package practice;

public class Main {
	int x;
	
	public Main(int x) {
		
		System.out.println(x);
	}
	public static void main(String [] args) {
		Main obj=new Main(23);
		System.out.println("value of x = " + obj.x);
		
	}
}
