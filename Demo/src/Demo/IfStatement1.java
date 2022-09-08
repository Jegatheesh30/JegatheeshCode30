package Demo;

public class IfStatement1 {

	public static void main(String[] args) {
		double n1=-0.89,n2=4.99,n3=-2.3,largest;
		/*if(n1>n2){
			if(n1>n3) {
				largest=n1;
		}
			else
				largest=n3;
		}
		else
		{
			if(n2>n3) {
				largest=n2;
			}
			else {
				largest =n3;
			}
				
		}
		System.out.println("largest Number" + largest);
		*/
		// simple method to reduce code size;
		if((n1>n2)&&(n1>n3))
		largest =n1;	
		if(n2>n3)
			largest =n2;
		else 
			largest =n3;
		System.out.println("largest Number"+largest);
	
	}}
		
	
	

