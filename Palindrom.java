package week3.day2String;

public class Palindrom {

	public static void main(String[] args) {
	
		/*
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String s1="madam";
		String rev="";

int length = s1.length();
	for(int i=length-1;i>=0;i--)
	{
	rev=rev+s1.charAt(i);
}
	System.out.println("Reverse="+rev);
	if(s1.equals(rev)) {
		System.out.println("STRING IS PALINDROM");
	}
	else
	{
		System.out.println("NOT PALINDROM");
	}
	

	}
}
