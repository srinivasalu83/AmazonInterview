package leetcode;

public class LC33SearchRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={4, 5, 6, 7, 0, 1, 2};
		int target =8;
		System.out.println(search(input,target));
		target =2;
		System.out.println(search(input,target));
		target =3;
		System.out.println(search(input,target));
	}

	public static int search(int[] input, int target) {  
		return binarySearch(input, 0, input.length-1, target);
	}

	public static int binarySearch(int[] input, int left, int right, int target){
		if(left>right)
			return -1;
		int mid = (left+right)/2;
		if(target==input[mid])
			return mid;
		if(input[left]<input[mid]) //normal sequence [input[left], input[mid]]
		{
			if(target<input[mid] && target>=input[left])//in normal part
				return binarySearch(input, left, mid-1, target);
			else// in unnormal part
				return binarySearch(input, mid+1,right,target);
		}else if(input[mid]<input[right]){ ///normal sequence [input[mid], input[right]]
			if(target>input[mid] && target<=input[right])
				return binarySearch(input, mid+1,right,target);
			else
				return binarySearch(input, left, mid-1, target);
		}
		return -1;
	}
}
