package Assignment;
;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
	int n=83;
	int m=2;
	boolean prime=true;
	while(m<n)
	{
		if(n%m==0)
			prime=false;
			m++;
	}
	if(prime==true)
		System.out.println(" is prime Number");
	else 
		System.out.println(" is not prime Number");
}	
}		
	
	

