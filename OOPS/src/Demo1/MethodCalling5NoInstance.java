package Demo1;

class factn {

	int fact(int n) {
		if (n > 1) {
			int f = fact(n - 1);
			return n * f;

		} else {
			return 1;
		}
	}
}
public class MethodCalling5NoInstance {

	public static void main(String[] args) {
		factn m = new factn();
		int f=m.fact(5);
		System.out.println(f);

	}
}
