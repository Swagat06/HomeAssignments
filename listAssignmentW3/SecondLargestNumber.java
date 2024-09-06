package week3.listAssignmentW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int arr[] = { 3, 2, 11, 4, 6, 7};
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			list.add(num);
		}
		//  Arrange the collection in ascending order
		list.sort(null);
		//Finding 2nd largest number from the sorted list
		int secondLargeNum = list.get(list.size() - 2);
		System.out.println("Second largest Number is :" +secondLargeNum);

	}
}


