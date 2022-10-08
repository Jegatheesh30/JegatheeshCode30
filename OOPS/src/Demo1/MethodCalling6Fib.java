package Demo1;

class fib {
	int n1 = -1;
	int n2 = 1;
	int n3;
	int e = 1;
	int i;

	void m1() {
		if (e <= 10) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			e++;
			m1();
		}
	}
}

public class MethodCalling6Fib {

	public static void main(String[] args) {
		fib a = new fib();
		a.m1();

	}

}
