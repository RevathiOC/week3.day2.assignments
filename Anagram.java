package week3.day2String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */

		String text1="stops";
		String text2="potss";
		int l1=text1.length();
		int l2=text2.length();
		boolean equals=true;
		if(l1!=l2)
		{
			equals=false;
		}
		else
		{
			
			char[] text1Array = text1.toCharArray();
			char[] text2Array = text2.toCharArray();
		Arrays.sort(text1Array);
		System.out.println(text1Array);
		Arrays.sort(text2Array);
		System.out.println(text2Array);
		equals = Arrays.equals(text1Array,text2Array);
		}
		if(equals)
		{
			System.out.println(text1+" and "+text2+" are Anagrams ");
		}
		else
		{
			System.out.println(text1+" and "+text2+" are Anagrams ");
		}

	

}
}