package Sample;

class A{
	static {
		System.out.println("static 1");
	}
	A(){
		System.out.println("Constructor1");
	}
	void get1() {
		System.out.println("get1");
	}
}
class B extends A{
	static {
		System.out.println("static 2");
	}
	B(int b){
		System.out.println("constructor2");
	}
	void get2() {
		System.out.println("get2");
	}
}
class C extends B{
	static {
		System.out.println("static 3");
	}
	C(){
		super(23);
		System.out.println("constructor3");
	}
	void get3() {
		System.out.println("get3");
	}
}

public class New {
	public static void main(String[] args) {
		C obj=new C();
		obj.get1();
		obj.get2();
		obj.get3();
	}
	

}











