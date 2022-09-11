package Assignment;

public class PrintingOddEven {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		do
		{
		if(i%2!=0)
			System.out.print(i);
			i++;
		}
		while(i<=10);
		do
		{
		if(j%2==0)
			System.out.print(j);
			j++;
		}
		while(j<=10);
		}
	}
