package leetcode;

import java.util.Random;

public class NameGenerator {

	public static void main(String[] args) {
		String names[]={"Kyle","Alen","Martin"};
		Integer rates[]={4,2,8};
		System.out.println(randomName(names, rates));
	}

	public static String randomName(String names[], Integer rates[]){
		int sum =0;
		for(int i=0;i<rates.length;i++)
			sum = sum +rates[i];
		Random random = new Random(); 
		int current=random.nextInt(sum);
		System.out.println(current);
		for(int i=0;i<rates.length;i++){
			current = current -rates[i];
			if(current<=0)
				return names[i];
		}
		return "";
	}
}
