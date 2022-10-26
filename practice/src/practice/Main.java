package practice;

public class Main {
	int a=5;
	int b=10;
	int result;
	
	Main(){
		result=a+b;
		System.out.println("the result for normal "+ result);
	}
	Main(int a, int b){
		result=a+b;
		System.out.println("the result for overloaded "+ result);
	}
	
	public static void main(String[] args) {
		Main obj=new Main();
		Main obj1=new Main(923,232);
		
	}
}
