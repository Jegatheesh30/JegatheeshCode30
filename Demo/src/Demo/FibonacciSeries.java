package Demo;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=-1;
		int n2=1;
		int n3;
		int e=0;//use this variable to find the sum value of fibonacci series;
		for(int i=0;i<10;i++)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			e=e+n3;
		
		}
		System.out.println("total value of fibonacci ="+e);
	}

}
