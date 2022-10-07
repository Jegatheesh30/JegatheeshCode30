package Demo;

public class test2 {

		int rollNo;
		String Name;
		int Mark;
		char Grade;
		
		void SetGrade()
		{
			if(Mark>=91&&Mark<=100)
				System.out.println("A");
			if(Mark>=81&&Mark<=90)
				System.out.println("C");
			if(Mark<=80&&Mark>=71)
				System.out.println("C");
			if(Mark<=70&&Mark>=61)
				System.out.println("D");
			if(Mark<=60&&Mark>=51)
				System.out.println("E");
		}
		public static void main(String[] args) {
			test2 s1 = new test2();
			s1.rollNo=100;
			s1.Name="Raja";
			s1.Mark=55;
			s1.SetGrade();
			System.out.println(s1.Name+": "+s1.Grade);
			
			test2 s2 = new test2();
			s2.rollNo=101;
			s2.Name="Kumar";
			s2.Mark=90;
			s2.SetGrade();
			System.out.println();
			System.out.println(s2.Name+": "+s2.Grade);
				
		}		
	}

