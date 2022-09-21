package Demo;

public class test2 {



		public class test {

			public static void main(String[] args) {
				int n=5;
				int i=0;
				int p=1;
				for(i=1,p=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						p++;
						if(p%2==0)
							System.out.print("1");
						else 
							System.out.print("0");
					}System.out.println();
				}
			}
		}}

