package Demo;

public class SumOfdigits {
	
	//count the digit 

	public static void main(String[] args) {
		int a=122342994;
		int b,c,d=0;
		int j=0;
		for(;a>0;) {
		b=a%10;
		System.out.print(b+ "+");
		a=a/10;
		//a=c;
		d=d+b;
		}
		System.out.println(d);
	}
	}

