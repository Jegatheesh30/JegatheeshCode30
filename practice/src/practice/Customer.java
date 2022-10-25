package practice;

public class Customer {

	public static void main(String[] args) {
		Customer sathis = new Customer();
		sathis.fillform("sathish", 1231231, "jsanstark@gmail.com");
		Customer Ram=new Customer();
		Ram.fillform("ram",324234,23423,"sanke@gmail.com");
	}
	private void fillform(String name, int mob1, String mail) {
		System.out.println("Customer name :" +name);
		System.out.println("Customer Mobile Number :" +mob1);
		System.out.println("Customer mail id :" +mail);
	}
	
	
	private void fillform(String name, int mob1,int mob2,String mail) {
		System.out.println("Customer name :" +name);
		System.out.println("Customer Mobile Number :" +mob1);
		System.out.println("Customer Mobile Number 2 :" +mail);
		System.out.println("Customer mail id :" +mail);
	}
}
