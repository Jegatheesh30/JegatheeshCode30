package Demo;


public class Demo {
	public static void main(String[] args) {
				
		int n=12;
		if(n%3==0)
			System.out.println("bing");
		if(n%5==0)
			System.out.println("bang");
		if(n%3==0&&n%5==0)
			System.out.println("bing"+"bang");
		if(n%3==0||n%5==0)
			System.out.println(n);
		
		
}
}

