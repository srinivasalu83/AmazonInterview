package leetcode;

public class LC81SearchRotatedSortedArrayII {

	public static void main(String[] args) {
		int input[]={2,2, 0, 1, 2};
		int target =8;
		System.out.println(search(input,target));
		target =0;
		System.out.println(search(input,target));
	}
	
	public static boolean search(int[] input, int target) {
		if (input == null || input.length == 0)
			return false;
		int start = 0;
		int end = input.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (input[mid] == target)
				return true;
			if (input[start] < input[mid]) {// normal
				if (target >= input[start] && target < input[mid])// inside
					end = mid - 1;
				else
					start = mid + 1;
			} else if (input[start] > input[mid]) {// unnormal
				if (target > input[mid] && target <= input[end])// nomoral
					start = mid + 1;
				else
					end = mid - 1;
			} else
				start++;
		}

		return false;
	}
}
