package Assignment;

public class SquarerootOfGivenNumber {

	public static void main(String[] args) {
		int n=64;
		int i=2;
		while(i<=n/2) {
			if((n/i)==i) {
				System.out.println(i+" is the square root of "+n);
				break;
		}
		i++;	
		}
	}
}


