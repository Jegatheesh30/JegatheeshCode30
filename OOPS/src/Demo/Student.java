package Demo;

public class Student {
	int rollNo;
	String Name ;
	int mark;
	/*void display()
	{
		System.out.println(rollNo);
		System.out.println(Name);
		System.out.println(mark);
	}*/

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollNo=101;
		s1.Name ="Jega ";
		s1.mark =50;
		
	 //s1.display(); 
		
		System.out.println(s1.rollNo);
		System.out.println(s1.Name);
		System.out.println(s1.mark);
		
		Student s2 = new Student();
		s2.rollNo=102;
		s2.Name ="siva ";
		s2.mark =53;
		
		System.out.println(s2.rollNo);
		System.out.println(s2.Name);
		System.out.println(s2.mark); 

	}

}
