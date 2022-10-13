package Demo1;

class State {
	String name;
	static String country = "india";
	static String flag="ashoka chakra";
	int numberplate;
	void display() {
	System.out.println(numberplate);
	}
	static void print()
	{
		System.out.println(country);
		System.out.println(flag);
		
	}

public static void main(String [] args) {
	State tn=new State();
	
	tn.name="Tamilnadu";
	tn.numberplate=47;
	tn.display();
	
	State kr=new State();
	kr.name="kerala";

	kr.print();
	tn.print();
	

}
	

}
