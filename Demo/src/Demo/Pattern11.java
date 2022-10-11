package Demo;

public class Pattern11 {

	public static void main(String[] args) {
		int n=9;
		int i=1;
		int j=1;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i==1)
					System.out.print(j+" ");
				else if(i==n)
					System.out.print(i-j+1+" ");
				else if(j==1)
					System.out.print(i+" ");
				else if(j==n)
					System.out.print(j-i+1+"  ");
				else
					System.out.print("  ");
			}System.out.println();
			
		}
	}
}	
		
		
/*		int n=4;
		int i=0;
		int j=1;
		for(i=1;i<=n;i++) {
			System.out.print(i+" ");
			j++;
		}
		System.out.println();
		j=1;
		for(i=1;i<=n;i++) {
			if(i==1||i==n)
			System.out.print(++j+" ");
			else
				System.out.print("  ");
		}
		System.out.println();
		j=4;
		for(i=1;i<=n;i++) {
			if(i==1||i==n)
				System.out.print(--j+" ");
			else
				System.out.print("  ");
		}
		System.out.println();
		j=1;
		for(i=4;i>=j;i--) {
			System.out.print(i+" ");
		}
	*/	
