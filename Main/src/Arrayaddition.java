
public class Arrayaddition {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3,4},
				{2,3,2,2},
				{4,2,2,3}
		};
		int b[][]= {
				{2,3,2,3},
				{2,1,3,4},
				{1,3,4,2}
		};
		
		int c[][]=new int [3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {	
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}System.out.println();
		}
	}

}
