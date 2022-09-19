package Demo;

public class Dart1 {

	public static void main(String[] args) {
		int[] age = {1,2,3,4,5,1};
		int sum=0;
		double  average;
		for(int a:age) {
			
			sum+=a;
		}
		System.out.println("susm of the array " +sum);
		int lengthofarray= age.length;
		System.out.println("total number of elements in array  " +lengthofarray);
		
		average =((double)sum/(double)lengthofarray);
		System.out.println(average);
	}
}
