package week3.day2String;

import java.util.Arrays;

// TODO Auto-generated method stub
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		

		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		System.out.println("Input String is:"+test);
		String[] splitStr = test.split(" ");
		int length = splitStr.length;
		String output=" ";
		for(int i=0;i<length;i++)
		{
			if(i%2!=0)//o%2==0[I],1%2=1[am],2%2=0[a]...
			{
				String s=" ";
				char[] charArray = splitStr[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--)
				{
					s=s+charArray[j];
					
				}
				output=output+" "+s;
			}
			else
			{
				output=output+" "+splitStr[i];
			}
		}
		System.out.println("output string is:"+output);
		
		
	}

}	
		
		
		
		
		
		
		
		
		
		
		
		
		
	