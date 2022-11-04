package String;

public class Next {
	public static void main(String [] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
		  for (int j=1;j<=i;j++){
			  int b=i>n/2?n-i:i;
			  if(b>=j)
		     System.out.print(" "+j);		  
		  }
		  System.out.println();
		}
	}
}