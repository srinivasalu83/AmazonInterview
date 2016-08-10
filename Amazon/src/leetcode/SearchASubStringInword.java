package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SearchASubStringInword {

	public static void main(String[] args) {
		String s = "banana";

		Set<String> set = new HashSet<>();
		ArrayList<String> arrlist = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length() + 1; j++) {
				String temp = s.substring(i, j);
				if (!set.add(temp)) {

					arrlist.add(temp);
					// System.out.println(temp);
				}

			}
		}

		Collections.sort(arrlist, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}

		});
		System.out.println(arrlist.get(0));

	}

}