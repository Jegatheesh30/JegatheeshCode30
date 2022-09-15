package Demo;


public class SumOfdigits {
	
	//count the digit 

	public static void main(String[] args) {
		int a=214141242;
		int j,m,k=0;
		int d=0;
		while(a>0)
		{
			j=a%10;
			System.out.println(j);
			a=a/10;
			k=k+j;}
			System.out.println(k);
			{
				while(k>0) {
				m=k%10;
				System.out.println(m);
				k=k/10;
				d=d+m;
			}
			System.out.println(d);
		}	
	}
}
