package String;

public class ComparisonString {
	public static void main(String[] args) {
		String first="what is your name?";
		String second="what is your name?";
		String third="wher are you from";
		
		//we use the boolean keyword the find the string comparison
		
		boolean result1=first.equals(second);
		System.out.println("String first and second are equal :"+ result1);
		
		boolean result2=first.equals(third);
		System.out.println("String first and third are equal :"+result2);
		
	}

}
