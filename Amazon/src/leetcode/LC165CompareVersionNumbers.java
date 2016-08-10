package leetcode;

public class LC165CompareVersionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v1="1.2";
		String v2="13.37";
		System.out.println(v1+" "+ v2+" "+compare(v1, v2));
		v1="13.07";
		System.out.println(v1+" "+ v2+" "+compare(v1, v2));
		v1="13.57";
		System.out.println(v1+" "+ v2+" "+compare(v1, v2));
		v1="013.37";
		System.out.println(v1+" "+ v2+" "+compare(v1, v2));
		v1="013.37.00";
		System.out.println(v1+" "+ v2+" "+compare(v1, v2));
	}
	
	static int compare(String v1, String v2){
		int v1start=0;
		int v2start=0;
		while(v1start<v1.length()&&v2start<v2.length()){
			
			while(v1start<v1.length()&&v1.charAt(v1start)=='0')
				v1start++;
			while(v2start<v2.length()&&v2.charAt(v2start)=='0')
				v2start++;
			int v1end=v1start;
			int v2end=v2start;
			while(v1end<v1.length()&&v1.charAt(v1end)!='.')
				v1end++;
			while(v2end<v2.length()&&v2.charAt(v2end)!='.')
				v2end++;
			if(v1start==v1end&&v2start==v2end){
				v1start++;
				v2start++;
				continue;
			}
			else if(v1end-v1start>v2end-v2start)
				return 1;
			else if(v1end-v1start<v2end-v2start)
				return -1;
			while(v1start<v1.length()&&v1start<v1end){
				if(v1.charAt(v1start)>v2.charAt(v2start))
					return 1;
				if(v1.charAt(v1start)<v2.charAt(v2start))
					return -1;
				v1start++;
				v2start++;
			}
		}
		while(v1start<v1.length()){
			if(v1.charAt(v1start)!='0')
				return 1;
			v1start++;
			}
		while(v2start<v2.length()){
			if(v2.charAt(v2start)!='0')
				return -1;
			v2start++;
			}
		return 0;
	}

}
