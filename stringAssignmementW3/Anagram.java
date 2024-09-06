package week3.stringAssignmementW3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		// Declare two strings
		String text1 = "stops";  
		String text2 = "potss";

		//Check if the lengths of the two strings are equal 
		int l1 = text1.length();
		int l2 = text2.length();

		if(l1==l2)
		{
			System.out.println("This strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		//Convert both the strings to character arrays 
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();

		// Sort both the character arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Verify if the sorted arrays are equal
		if(Arrays.equals(charArray1, charArray2))
		{
			System.out.println("The given strings are Anagram");
		}
		else
		{
			System.out.println("The given strings are not an Anagram");
		}


	}

}




