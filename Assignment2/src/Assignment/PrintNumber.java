package Assignment;

public class PrintNumber {

	public static void main(String[] args) {  //printing 1 11 121
		int i=1;
		do {
		int sum1=0+i;
		System.out.println(i);
		int sum=sum1*11;
		i=sum;
		}while(i<=500);
	}

}
