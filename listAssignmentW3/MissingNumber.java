package week3.listAssignmentW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] numlist =  {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(numlist);
		// System.out.println("Sorted Array Is:");
		for (int num : numlist) {
//			System.out.println(num);
		}
		List<Integer> missingNo = new ArrayList<>();
		for (int i = 0; i < numlist.length - 1; i++) {
			//check the current element + 1 is not equal to the next element
			if (numlist[i] + 1 != numlist[i + 1]) {
				missingNo.add(numlist[i] + 1);
			}
		}
		System.out.println("Missing numbers are "+missingNo);

	}

}
