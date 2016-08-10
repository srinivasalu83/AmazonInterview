package leetcode;

public class CountingSort {
//http://www.geeksforgeeks.org/counting-sort/
	public static void main(String[] args) {
		int input[]={1, 4, 1, 2, 7, 5, 2};
		input=countingSort(input,8);
		for(int i=0;i<input.length;i++)
		System.out.print(input[i]+" ");
	}

    public static int[] countingSort(int[] a, int k) {
    	int min = a[0];
    	int max = a[0];
    	for(int i=1;i<a.length;i++){
    		if(a[i]<min)
    			min = a[i];
    		if(a[i]>max)
    			max = a[i];
    	}
        int c[] = new int[max-min+1];
        for (int i = 0; i < a.length; i++)
            c[a[i]-min]++;
        for (int i = 1; i < max-min+1; i++)
            c[i] += c[i-1];
        int b[] = new int[a.length];
        for (int i = a.length-1; i >= 0; i--)
            b[--c[a[i]-min]] = a[i];
        return b;
    }
}
