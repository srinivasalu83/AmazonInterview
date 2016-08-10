package leetcode;

//https://www.careercup.com/question?id=5716759337238528
public class IdentifyString {
	private static int stringCount=0;

	public static void main(String[] args) {
		char[][] inputArray = { {'B', 'B', 'A', 'B', 'B', 'N'},
						{'B', 'B', 'M', 'B', 'B', 'O'},
						{'B', 'B', 'A', 'B', 'B', 'Z'},
						{'N', 'O', 'Z', 'A', 'M', 'A'},
						{'B', 'B', 'B', 'B', 'B', 'M'},
						{'B', 'B', 'B', 'B', 'B', 'A'} };
				
		countOccurence(inputArray,"AMAZON");
		System.out.println("count of string is "+stringCount);

	}

    public static void countOccurence(char[][] inputArray,String input){
		for(int i=0;i<inputArray.length;i++)
			for(int j=0;j<inputArray[0].length;j++)
				recersive(inputArray,input,0,i,j);
	}

    public static void recersive(char[][] inputArray,String input, int index, int i, int j){
    	if(inputArray[i][j]!=input.charAt(index))
    		return;
    	if(index==input.length()-1)
    	{
    		stringCount++;
    		return;
    	}
    	if(i>0){
    		char tmp=inputArray[i][j];
    		inputArray[i][j]='#';
			recersive(inputArray,input,index+1,i-1,j);
			inputArray[i][j]=tmp;
    	}
    	if(j>0){
    		char tmp=inputArray[i][j];
    		inputArray[i][j]='#';
			recersive(inputArray,input,index+1,i,j-1);
			inputArray[i][j]=tmp;
    	}
    	if(i<inputArray.length-1){
    		char tmp=inputArray[i][j];
    		inputArray[i][j]='#';
			recersive(inputArray,input,index+1,i+1,j);
			inputArray[i][j]=tmp;
    	}
    	if(j<inputArray[0].length-1){
    		char tmp=inputArray[i][j];
    		inputArray[i][j]='#';
			recersive(inputArray,input,index+1,i,j+1);
			inputArray[i][j]=tmp;
    	}
    }
}
