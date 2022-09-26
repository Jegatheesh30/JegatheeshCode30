package Demo;

import java.util.Scanner;

public class EBbillProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Unit reading");
		int n = input.nextInt();
		double bill = 0;
		double total;
		double rem = 0;
		if (n < 100) {
			bill = n * 0;
			System.out.println("Electricity charge Rs." + bill);
		} else if (n > 100 && n < 200) {
			rem = n - 100;
			bill = rem * 1.5;
			System.out.println("Electricity charge Rs." + bill);
		} else if (n > 100 && n < 500) {
			rem = n - 200;
			bill = rem * 3;
			total = bill + 200;
			System.out.println("Electricity charge Rs." + total);
		} else if (n > 500) {
			rem = n - 500;
			bill = rem * 6.6;
			total = bill + 1730;
			System.out.println("Electricity charge Rs." + total);
		}
	}
}
