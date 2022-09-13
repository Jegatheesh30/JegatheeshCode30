package Assignment;

public class PrintingNumbers1 {
	public static void main(String[] args) {
		int i=1;
		int j=0;
		int sum;
		do {
		sum=i+j;
		i=sum;
		j++;
		System.out.print(" "+ sum);
		}
		while(sum<20);	
	}
}
