package Sample;

class emp{

	int empid;
	int salary;
	static String ceo = " mahesh"; //after static this variable is common for all object

public void show() {
	System.out.println(empid + " : " + salary + " : " + ceo);
}
}

public class Statickey {
	public static void main(String[] args) {
		emp kumar = new emp();
		kumar.empid=23;
		kumar.salary=23000;
		
		emp arun = new emp();
		arun.empid=24;
		arun.salary=40000;
		
		
		
		kumar.show();
		arun.show();
	
	}
	
}
