package Assignment;

public class LeastCommonMultipleOfGivenNumber {
	public static void main(String[] args) {
		int i=7;
		int j=9;
		int sum,sum1;
		int g=0;
		for(int k=1;k<=i;k++) {
			if(i%k==0&&j%k==0)
				g=k;
		}
		sum=i*j/g;
		System.out.println(sum);
	}
}



