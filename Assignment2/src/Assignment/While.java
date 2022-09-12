package Assignment;

public class While {

	public static void main(String[] args) {
		int i=0;
		do
		{	i++;
			if(i%3==0&i%5==0)
				System.out.println("bing bang");
			else if(i%3==0)
				System.out.println("bing");
			else if(i%5==0)
				System.out.println("bang");
			else
				System.out.println(i);
		}while(i<0);
		}}

	/*	int i=1;
		while (i<7){
			if(i==4)
			{
				i++;
				continue;
			}
		System.out.println(i++);
		}}} */
		/*int i=0;
	for(i=0;i<=20;i++) {
		System.out.println(i);
	}
	}}*/
		