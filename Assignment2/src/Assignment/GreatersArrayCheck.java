package Assignment;

public class GreatersArrayCheck {

	public static void main(String[] args) {
		
		int a[]=new int [3];
		a[0]=5;
		a[1]=9;
		a[2]=7;
		if((a[0]>a[1])&&(a[0]>a[2]))
				System.out.println(a[0]+" is greater");
		else if(a[1]>a[2])
				System.out.println(a[1]+ "is greater");
		else 
			System.out.println(a[2]+ "is greater");
	}
}
