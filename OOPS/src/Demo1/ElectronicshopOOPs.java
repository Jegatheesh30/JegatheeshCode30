package Demo1;
import java.util.Scanner;

public class ElectronicshopOOPs {
		
		String name;
		String MobileNo;
		void LaptopDetails(int  n,String name,String MobileNo) {
			double discount = 0;
			double TotalValue = 0;
			double sum = 0;
			double laptopcost=0;
			double c=0;
			for (int k = 1; k <= n; k++) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter cost of " + k + " laptop");
					laptopcost = sc.nextInt();
				if (laptopcost <= 25000) {
					discount = (laptopcost / 100) * 5;
					sum = (laptopcost - discount);
					System.out.println("Value after reduction of discount " + sum);
				} else if (laptopcost > 25000 && laptopcost <= 50000) {
					discount = (laptopcost / 100) * 7.5;
					sum = (laptopcost - discount);
					System.out.println("Value after reduction of discount " + sum);
				} else if (laptopcost > 50000 && laptopcost <= 100000) {
					discount = (laptopcost / 100) * 10.0;
					sum = (laptopcost - discount);
					System.out.println("Value after reduction of discount " + sum);
				} else if (laptopcost > 100000) {
					discount = (laptopcost / 100) * 15.0;
					sum = (laptopcost - discount);
					System.out.println("Value after reduction of discount " + sum);
				} else {
					System.out.println("Enter ivalid detail");
				}
				TotalValue += sum;
				 
			}
			System.out.println(TotalValue);
			System.out.println("------------------------------------------");
			System.out.println("Invoice");
			System.out.println("Customer Name      : " + name);
			System.out.println("Custome Mobbile No : " + MobileNo);
			System.out.println("Number of Laptops  :" + n );
			System.out.println("Total Cost         :" + TotalValue);
			System.out.println("---------------Welcome--------------------");
			System.out.println("--------Save tree && Save nature----------");
			
		}
	public static void main(String[] args) {
		ElectronicshopOOPs a=new ElectronicshopOOPs();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String name = sc.nextLine();
		System.out.println("Enter Customer Mobile No");
		String MobileNo = sc.nextLine();
		System.out.println("Enter Qty. of laptops");
		int n = sc.nextInt();
		a.LaptopDetails(n, name, MobileNo);
		
		
	}

}
