package leetcode;

public class InPlaceSort {

	public static void main(String[] args) {
		int input[]={4, 2, 9, 1, 3};
		sort(input);
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
	}

	public static void sort(int input[]){
		for(int i=0;i<input.length-1;i++)
			for(int j=1;j<input.length-i;j++){
				if(input[j-1]>input[j])
				{
					input[j-1]=input[j-1]+input[j];
					input[j]=input[j-1]-input[j];
					input[j-1]=input[j-1]-input[j];
				}
			}
	}
}
