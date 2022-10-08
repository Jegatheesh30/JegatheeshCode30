package Demo1;

class operator {
	int num1;
	int num2;
	int Addition;
	int Substraction;
	int Multiplication;
	int Divison;
	int reminder;
	
public void Addition() {
	Addition=num1+num2;
	System.out.println("Addition :"+ Addition);
}
public void Substraction() {
	Substraction=num1-num2;
	System.out.println("Substraction :"+ Substraction);
}
public void Multiplication() {
	Multiplication=num1*num2;
	System.out.println("Multiplication :"+Multiplication);
}
public void Divison() {
	Divison=num1/num2;
	System.out.println("Divison :" +Divison );
}
public void reminder() {
	reminder=num1%num2;
	System.out.println("reminder :" +reminder);
}

}


public class OperatorDemo {

	public static void main(String[] args) {
		operator obj=new operator();
		obj.num1=2;
		obj.num2=3;
		obj.Addition();
		obj.Substraction();
		obj.Multiplication();
		obj.Divison();
		obj.reminder();

	}

}
