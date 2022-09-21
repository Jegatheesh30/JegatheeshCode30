package Demo;

public class test {

	public static void main(String[] args) {
		int n=3;
		int i=0;
		int p=1;
		for(i=1,p=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(p+++" ");
			}System.out.println();
		}
	}
}
