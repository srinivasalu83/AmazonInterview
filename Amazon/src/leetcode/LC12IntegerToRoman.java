package leetcode;

public class LC12IntegerToRoman {

	public static void main(String[] args) {
		int numbers[]={3999,2000,1990,1984,1976,1900,1899,1888,1666,1600,1500,1400,1100,999,900,800,700,600,500,400,300,200,100,99,98,95,34,16,6,};
		for(int current:numbers){
			System.out.print(current+" ");
			System.out.print(transfer(current)+" ");
			System.out.println(intToRoman(current));
		}

	}

	public static String intToRoman(int input){
		String result="";
		String symbols[]={"M", "CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		Integer nums[] = { 1000,900, 500,400, 100,90,  50, 40,  10, 9,   5,  4,   1};
		int index=0;
		while(input>0){
			if(input>=nums[index] ){
				input=input-nums[index];
				result=result+symbols[index];
			}
			else
				index++;
		}
		return result;
	}
	
	
	public static String transfer(int input){
		String output=new String();
		int thousands = input/1000;
		for(int i=0;i<thousands;i++)
		{
			output=output+"M";
		}
		input=input-thousands*1000;
		
		if(input>=900)
		{
			input=input-900;
			output=output+"CM";
		}
		
		int hundreds=input/100;
		if(hundreds>=5){
			output=output+"D";
			for(int i=0;i<hundreds-5;i++)
			    output=output+"C";	
		}else if(hundreds==4)
			output=output+"CD";
		else if(hundreds>0)
			for(int i=0;i<hundreds;i++)
			    output=output+"C";	
		input=input-hundreds*100;

		if(input>=90)
		{
			input=input-90;
			output=output+"XC";
		}
		
		int tens=input/10;
		if(tens>=5){
			output=output+"L";
			for(int i=0;i<tens-5;i++)
			    output=output+"X";	
		}else if(tens==4)
			output=output+"XL";
		else if(tens>0)
			for(int i=0;i<tens;i++)
			    output=output+"X";
		input=input-tens*10;

		if(input>=9)
		{
			input=input-9;
			output=output+"IX";
		} else if(input>=5){
			output=output+"V";
			for(int i=0;i<input-5;i++)
			    output=output+"I";	
		}else if(input==4)
			output=output+"IV";
		else if(input>0)
			for(int i=0;i<tens;i++)
			    output=output+"I";
		
		return output;
	}
}
