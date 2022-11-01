package Sample;

public class Interview {
		String name;
		String degree;
		int year;
		
		void call() {
			System.out.println("Name 	:"+name);
			System.out.println("Degree  :"+degree);
			System.out.println("Year 	:"+year);
		}
		Interview(){
			System.out.println("Provide = tea and biscuit given for every one");
		}
		Interview(String name,String degree,int year){
			this();//while we call another constructor this should be the first stae.
			this.name=name;
			this.degree=degree;
			this.year=year;	
		}
		public static void main(String[] args) {
			Interview jd=new Interview("jegatheesh","MCA",2021);
			Interview jds=new Interview("jsanstark","BCA",2022);
			jd.call();
			jds.call();
		}
}
