package leetcode;

public class LC64MinimumPathSum {

	public static void main(String[] args) {
		int grid[][]={{2,1,3},{5,2,8},{9,17,2}};
		System.out.println(LC64MinimumPathSum.minPathSum(grid));
	}

	public static int minPathSum(int[][] grid){
		int m=grid.length;
		int n=grid[0].length;
		int[][] step=new int[m][n];
		step[0][0]=grid[0][0];
		for(int i=1;i<n;i++)
			step[0][i]=step[0][i-1]+grid[0][i];
		for(int j=1;j<m;j++)
			step[j][0]=step[j-1][0]+grid[j][0];
		for(int i=1;i<n;i++)
			for(int j=1;j<m;j++)
				step[i][j] = Math.min(step[i-1][j],step[i][j-1])+grid[i][j];
		return step[m-1][n-1];
	}
}