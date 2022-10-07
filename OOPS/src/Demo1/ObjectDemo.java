package Demo1;

class calc {
	int num1;
	int num2;
	int result;

public void process()
{
	result=num1+num2;
}

}
public class ObjectDemo {

	public static void main(String[] args) 
	{
		calc obj=new calc();
		obj.num1=23;
		obj.num2=24;
		obj.process();
		System.out.println(obj.result);
		
	}

}
