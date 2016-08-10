package leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class KWayMerge {
    //http://www.geeksforgeeks.org/merge-k-sorted-arrays/
	public static void main(String[] args) {
		
        int	arr[][] = { {1, 3, 5, 7},
	            {2, 4, 6, 8},
	            {0, 9, 10, 11}} ;
        int result []=kSort(arr);
        for(int c:result)
        	System.out.print(c+" ");
	}

	public static int[] kSort(int arr[][]){
		int k = arr.length;
		int n = arr[0].length;
		int result[]=new int[k*n];
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
		HashMap<Integer, Integer> mapRow = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> mapCloumn = new HashMap<Integer, Integer>();
		for(int i=0;i<k;i++){
			mapRow.put(arr[i][0], i);
			mapCloumn.put(i, 0);
			queue.add(arr[i][0]);
		}
		for(int i=0;i<k*n;i++)
		{	int current = queue.poll();
			result[i]=current;
			int row=mapRow.remove(current);
			int column =mapCloumn.remove(row);
			if(column<n-1)
			{
				int next =arr[row][column+1];
				queue.add(next);
				mapRow.put(next, row);
				mapCloumn.put(row, column+1);
			}
			else
				continue;
		}
		return result;
	}
}
