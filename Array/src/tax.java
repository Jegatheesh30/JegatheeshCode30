import java.util.Scanner;
public class tax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the income : ");
		long income =input.nextLong();
		int d=0;
		if(income>=0&&income<=250000) { //case 1
			d=1;
		}
		if(income>250000&&income<=500000) //case 2
		{
			d=2;
		}
		if(income>=500000&&income<=750000) {//case 3
			d=3;
		}
		if(income>=750000&&income<=1000000) {//case 4
			d=4;
		}
		if(income>=1000000&&income<=1250000) {//case 5
			d=5;
		}
		if(income>=1250000&&income<=1500000) {//case 6	
			d=6;
		}
		if(income>1500000) { //case 7
			d=7;
		}
			
		switch(d) {
		
		case 1:
			System.out.println("exempt because below 2,50,000");
			break;
		case 2:
		{
			double oldper=((income/100)*5);
			System.out.println("old percentage 5%    :"+oldper);
			double newper=((income/100)*5);
		    System.out.println("new percentage 5%    :"+newper);
		    double diff=oldper-newper;
		    System.out.println("difference amout : "+diff);
		}
		break;
		case 3:
		{
			double oldper=((income/100)*20);
			System.out.println("old percentage 20% :"+oldper);
			double newper=((income/100)*10);
		    System.out.println("new percentage 10% :"+newper);
		    double diff=oldper-newper;
		    System.out.println("difference amout : "+diff);
		}
		break;
		case 4:
		{
			double oldper=((income/100)*20);
			System.out.println("old percentage 20% :"+oldper);
			double newper=((income/100)*15);
		    System.out.println("new percentage 15% :"+newper);
		    double diff=oldper-newper;
		    System.out.println("difference amout : "+diff);
		}
		break;
		case 5:
		{
			double oldper=((income/100)*30);
			System.out.println("old percentage 30% :"+oldper);
			double newper=((income/100)*20);
		    System.out.println("new percentage 20% :"+newper);
		    double diff=oldper-newper;
		    System.out.println("difference amout : "+diff);
		}
		break;
		case 6:
		{
			double oldper=((income/100)*30);
			System.out.println("old percentage 30% :"+oldper);
			double newper=((income/100)*25);
		    System.out.println("new percentage 25% :"+newper);
		    double diff=oldper-newper;
		    System.out.println("difference amout : "+diff);
		}
		break;
		case 7:
		{
			double oldper=((income/100)*30);
			System.out.println("old percentage 30% :"+oldper);
			double newper=((income/100)*30);
		    System.out.println("new percentage 30% :"+newper);
		    double diff=oldper-newper;
		    System.out.println("difference amout : "+diff);
			
		}
		
		default:
			System.out.println("enter the insufficient income");
		
		}
	}
}

/*	case 0:
{
	if(expression>=0&&expression<=250000) {
		System.out.println("Exempt");
	}
	else 
	break;
		
}
break;
case 1:
{
	if(expression>250000&&expression<=500000)
	{
		double oldper=((expression/100)*5);
				System.out.println("old percentage :"+oldper);
		double newper=((expression/100)*5);
			    System.out.println("new percent :"+newper);
			    double diff=oldper-newper;
			    System.out.println(diff);
	}
	else 
	break;
}
*/
