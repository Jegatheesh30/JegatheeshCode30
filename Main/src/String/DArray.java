package String;

public class DArray {

	public static void main(String[] args) {
		int[][] a= {
				{1,1,1},
				{2,2,2},
				{3,4,5}
		};
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<row;i++) {
			int sumrow=0;
			for(int j=0;j<col;j++) {
				sumrow+=a[i][j];
			}
			System.out.println("sum of "+(i+1)+" rows " +sumrow);
		}
		
		for(int i=0;i<col;i++) {
			int sumcol=0;
			for(int j=0;j<row;j++) {
				sumcol+=a[j][i];
			}
			System.out.println("sum of "+(i+1)+" rows "+sumcol);
			
		}
		
		}
}
