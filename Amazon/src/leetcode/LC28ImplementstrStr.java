package leetcode;

//http://www.cnblogs.com/springfor/p/3896469.html

public class LC28ImplementstrStr {

	public static void main(String[] args) {
		LC28ImplementstrStr imp = new LC28ImplementstrStr();
		System.out.println(imp.strStr("aaaaabce","ab"));
	}

	public String strStr(String haystack, String needle){
		if(needle.length()==0)
			return haystack;
		int last = haystack.length()-needle.length();
		for(int i=0;i<last;i++){
			int j=i;
			boolean find = true;
			for(int k=0;k<needle.length();k++,j++){
				char h = haystack.charAt(j);
				char n = needle.charAt(k);
				if(h!=n)
				{
					find = false;
				}
			}
			if(find)
				return haystack.substring(i);
		}
			
		return null;
	}
	
    public int strStr2(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        
        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            int j = 0;
            for (j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            // finished loop, target found
            if (j == target.length()) {
                return i;
            }
        }
        return -1;
    }
}
