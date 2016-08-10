package leetcode;

public class Matrix {

	public static int[][] createMatrix(){
		int[][] matrix={{1,2,3},
				        {4,0,6},
				        {7,8,0},
				        {10,11,12}};
		return matrix;
	}
	
	public static int[][] createMatrix33(){
		int[][] matrix={{1,2,3},
				        {4,0,6},
				        {7,8,0}};
		return matrix;
	}
	
	public static int[][] createMatrix44(){
		int[][] matrix={{1,2,3,4},
				        {5,6,7,8},
				        {8,9,-1,-2},
				        {-3,-4,-6,-7}};
		return matrix;
	}
	
	public static int[][] createMatrix55(){
		int[][] matrix={{1,2,3,4,5},
				        {6,7,8,9,0},
				        {10,11,12,13,14},
				        {-1,-2,-3,-4,-5},
				        {-6,-7,-8,-9,10}};
		return matrix;
	}
	
	public static int[][] createIslands(){
		int[][] matrix= {{1, 1, 0, 0, 0},
        {0, 1, 0, 0, 1},
        {1, 0, 0, 1, 1},
        {0, 0, 0, 0, 0},
        {1, 0, 1, 0, 1}};
		return matrix;
	}
	
	public static void print(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
}
