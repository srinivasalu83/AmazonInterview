package leetcode;

public class LC200NumberIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix=Matrix.createIslands();
		Matrix.print(matrix);
		System.out.println(searchIslands(matrix));
		Matrix.print(matrix);
	}

	public static int searchIslands(int[][] matrix){
		int count=0;
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==1){
					count++;
					dfs(matrix, i, j);
				}
			}
		return count;
		
	}
	
	public static void dfs(int[][] matrix, int i, int j){
		if(i<0||i>=matrix.length||j<0||j>=matrix[0].length)
			return;
		if(matrix[i][j]!=1)
			return;
		matrix[i][j]=-1;
		dfs(matrix, i-1, j);
		dfs(matrix, i+1, j);
		dfs(matrix, i, j-1);
		dfs(matrix, i, j+1);
	}
}
