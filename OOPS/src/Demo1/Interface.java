package Demo1;


interface Family
{
	void takecare();
	void attendfunction();
	
}

interface Company
{
	void attendance();
	void dresscode();
}

class Person implements Family, Company
{

	@Override
	public void attendance() {
		System.out.println("the family fuction is important");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dresscode() {
		System.out.println("dress code is must in company");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takecare() {
		System.out.println("pampering is must for every child");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attendfunction() {
		System.out.println("Every member in family function must attend interview");
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Person Raj = new Person();
		Raj.takecare();
		Raj.attendfunction();
		Raj.attendance();
		Raj.dresscode();
	
		Family son =new Person();
		son.takecare();
		son.attendfunction();
		
		Company emp=new Person();
		emp.attendance();
		emp.dresscode();

}
}