package String;
import java.util.Scanner;

public class Binary {
	
	int findpower(int no, int pow) {
	 int result =1;
	 while(pow>=1)
	 {
		 result=result*no;
		 pow=pow-1;
	 }
	 return result;
	}
	public static void main(String[] args) {
		Binary obj=new Binary();
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the binary no       :");
		int BinaryNo=sc.nextInt();
		int rem;
		int decimal=0;
		int i=2;
		int j=0;
		while(BinaryNo>0) {
			rem=BinaryNo%10;
			int value=rem*obj.findpower(i, j);
			decimal=decimal+value;
			BinaryNo/=10;
			j=j+1;
		}
		System.out.print("Decimal value of BinaryNo : "+decimal);
	}
}
