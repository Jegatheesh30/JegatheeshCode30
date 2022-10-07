package Demo;
public class test {
	int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static void main(String [] args) {
		test p =new test();
		int a=p.fact(4);
		int b=p.fact(6);
		System.out.println(a);
		System.out.println(b);
	/*	int sum=0;
		for(int i=1;i<10;i++) {
			int a=p.fact(i);
			
			sum=a+sum;		
		}*/
		
	}
	}