package leetcode;

public class LC38CountAndSay {

	public static void main(String[] args) {		
		System.out.println(countSay(1));
		System.out.println(countSay(2));
		System.out.println(countSay(3));
		System.out.println(countSay(4));
		System.out.println(countSay(5));
	}

	public static String countSay(int n) {
		if (n <= 0)
			return "";
		StringBuilder strBuilder = new StringBuilder("1");
		if (n == 1)
			return strBuilder.toString();
		else {
			for (int j = 2; j <=n; j++){
				char current = strBuilder.charAt(0);
				int count = 1;
				StringBuilder tmp = new StringBuilder();
				for (int i = 1; i < strBuilder.length(); i++) {
					if (strBuilder.charAt(i) == current)
						count++;
					else {
						tmp.append(count);
						tmp.append(current);
						count = 1;
						current = strBuilder.charAt(i);
					}
				}
				tmp.append(count);
				tmp.append(current);
				strBuilder = tmp;
			}
			return strBuilder.toString();
		}
	}

	private String countAndSay(int n) {
		if (n <= 1) {
			return "1";
		} else
			return say(countAndSay(n - 1));
	}

	private String say(String s) {
		int i = 0;
		int count = 1;
		StringBuffer sb = new StringBuffer();
		while (i < s.length()) {
			int j = i + 1;
			while (j < s.length() && s.charAt(i) == s.charAt(j)) {
				count++;
				j++;
			}
			sb.append(count + "");
			sb.append(s.charAt(i));
			i = j;
			count = 1;
		}
		return sb.toString();
	}
}
