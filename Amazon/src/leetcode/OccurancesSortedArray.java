package leetcode;

public class OccurancesSortedArray {

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 2, 2, 3,};
		System.out.println(count(arr,1));
		System.out.println(count(arr,2));
		System.out.println(count(arr,3));
		System.out.println(count(arr,4));
	}

	public static int count(int arr[], int target){
		int count=0;
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		while(arr[mid]!=target && start<end-1){
			if(arr[mid]>target){
				end=mid;
				mid=(start+end)/2;
			}else if(arr[mid]<target){
				start=mid;
				mid=(start+end)/2;
			}
		}
		while(mid>=0&&arr[mid]==target){
			mid--;
		}
		mid++;
		while(mid<arr.length&&arr[mid]==target){
			count++;
			mid++;
		}
		return count;
	}
}
