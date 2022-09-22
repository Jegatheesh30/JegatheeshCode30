package Assignment;
import java.util.Scanner;


public class BinaryToDecimal {
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a Binary number to conver decimal?");
	int binary=in.nextInt();
	int decimal =0,i=0;
	int rem=0;
	while(binary>0) {
	rem = binary%10;
	decimal = (int)(decimal+(rem*Math.pow(2,i)));
	binary = binary/10;
	i=i+1;
	}System.out.println(decimal);
	}
}