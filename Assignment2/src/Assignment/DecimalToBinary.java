package Assignment;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to convert binay?");
		int deci=input.nextInt();
		int rem = 0;
		String binary = " ";
		while (deci > 0) {
			rem = deci % 2;
			binary = rem + binary;
			deci = deci / 2;
		}
		System.out.println(binary);
	}
}