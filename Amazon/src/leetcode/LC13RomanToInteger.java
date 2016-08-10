package leetcode;

public class LC13RomanToInteger {

	public static void main(String[] args) {
		
		String romans[]={"VII","XVI","XVIII","LXXX","XCIX","CMXCIX","M","MC","MCD","MD","MDC","MDCLXVI","MDCCCLXXXVIII","MDCCCXCIX","MCM","MCMLXXVI","MCMLXXXIV","MCMXC","MM","MMMCMXCIX"};
		
		for(String rom:romans){
			System.out.print(rom+" ");
			System.out.print(romanToInt(rom)+" ");
			System.out.println(transfer(rom));
		}
/*		System.out.println(rtt.transfer("VII"));
		System.out.println(rtt.transfer("XVI"));
		System.out.println(rtt.transfer("XVIII"));
		System.out.println(rtt.transfer("LXXX"));
		System.out.println(rtt.transfer("XCIX"));
		System.out.println(rtt.transfer("CMXCIX"));
		System.out.println(rtt.transfer("M"));
		System.out.println(rtt.transfer("MC"));
		System.out.println(rtt.transfer("MCD"));
		System.out.println(rtt.transfer("MD"));
		System.out.println(rtt.transfer("MDC"));
		System.out.println(rtt.transfer("MDCLXVI"));
		System.out.println(rtt.transfer("MDCCCLXXXVIII"));
		System.out.println(rtt.transfer("MDCCCXCIX"));
		System.out.println(rtt.transfer("MCM"));
		System.out.println(rtt.transfer("MCMLXXVI"));
		System.out.println(rtt.transfer("MCMLXXXIV"));
		System.out.println(rtt.transfer("MCMXC"));
		System.out.println(rtt.transfer("MM"));
		System.out.println(rtt.transfer("MMMCMXCIX"));*/

	}
	
	public static int romanToInt(String input){
		String symbols[]={"M", "CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		Integer nums[] = { 1000,900, 500,400, 100,90,  50, 40,  10, 9,   5,  4,   1};
		int i=0;
		int result=0;
		while(input!=null && input.length()>0){
			if(input.startsWith(symbols[i])){
				input=input.substring(symbols[i].length());
				result=result+nums[i];
			}
			else
				i++;
		}
		return result;
	}
	
	public static int transfer(String input){
		int output=0;
		boolean minus=false;
	    for(int i=0;i<input.length();i++)  {
	        switch(input.charAt(i)){
	        case 'I':
	        	if(i<input.length()-1&&
	        			((input.charAt(i+1)=='V')||(input.charAt(i+1)=='X')))
	        		output=output-1;
	        	else
	        		output=output+1;
                break;  
	        case 'V':
	        	output=output+5;
                break;  
	        case 'X':
	        	if(i<input.length()-1&&
	        			((input.charAt(i+1)=='L')||(input.charAt(i+1)=='C')))
	        		output=output-10;
	        	else
	        		output=output+10;
                break;  
	        case 'L':
	        	output=output+50;
                break;  
	        case 'C':
	        	if(i<input.length()-1&&
	        			((input.charAt(i+1)=='D')||(input.charAt(i+1)=='M')))
	        		output=output-100;
	        	else
	        		output=output+100;
                break;  
	        case 'D':
	        	output=output+500;
                break;  
	        case 'M':
	        	output=output+1000;
                break;  
	        default:  
                return 0;
	        }
		}
		return output;
	}

}
