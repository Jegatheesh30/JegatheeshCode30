package Demo;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		double number; 
		double sum=0.0;
		while(1>0) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter number");
			number=input.nextDouble();
			if(number<0.0) {
				break;
			}
			sum+=number;//sum=sum+number
		}
		System.out.println("sum "+sum);
		
	}
}
