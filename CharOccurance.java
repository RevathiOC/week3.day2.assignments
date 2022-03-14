package week3.day2String;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";
		int count = 0;

		char[] charArray = str.toCharArray();
		int length = str.length();
		System.out.println("length of array :" + length);

		for (int i = 0; i < length; i++) {
			if (charArray[i] == 'e') {
				count = count + 1;

			}
		}
		System.out.println("character occarance is:" + count);

	}

}
