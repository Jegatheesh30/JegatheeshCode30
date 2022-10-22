package oppspractic;

public class main {	
	void display(int a) {
		System.out.println("the value was one string "+ a);
	}
	void display(int a, int b) {
		System.out.println("the value was "+ a+ " and "+ b);
	}
	
	public static void main(String[] args) {
	main value = new main();
	value.display(1);
	value.display(1,2);
	value.display(2,3);
	}
	}
