package week3.stringAssignmementW3;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
	
		String test = "Changeme";
		
		//Convert the given String to a character array
		
		char[] testChar = test.toCharArray();
		int l = testChar.length;

		for (int i = l- 1; i >= 0; i--) {
			if (i % 2 != 0) {
		// change the character to uppercase if the index is odd
				
				testChar[i] = Character.toUpperCase(testChar[i]);
				//System.out.println(arr[i]);
			}
		}
		//character to String convert
		String newString = new String(testChar);
		System.out.println("The changed String is "+newString);
			
		}
	}
	


