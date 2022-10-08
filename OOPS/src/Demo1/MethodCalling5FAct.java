package Demo1;

class Factorial{
	 int a=5;
	 int fact=1;
	 int b=1;
	 
	
	 void m1() {
		if(b<=a) {
			fact=fact*b;
			b++;
			m1();
		}
		
		
	}
}


public class MethodCalling5FAct {

	public static void main(String[] args) {
		Factorial A=new Factorial();
		A.m1();
		System.out.println(A.fact);

	}

}
