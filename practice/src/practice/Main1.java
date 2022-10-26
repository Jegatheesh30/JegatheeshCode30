package practice;

public class Main1 {
	String language;
	 
	Main1(){
		this.language="python";
		System.out.println(language);
	}
	Main1(String language){
		this.language="java";
		System.out.println(language);
	}
	public void getName() {
		System.out.println("Programming Language: "+ this.language);
	}

	public static void main(String[] args) {
		Main1 obj1 = new Main1();
		Main1 obj2 = new Main1("java");
		obj1.getName();
		obj2.getName();
	}
}
