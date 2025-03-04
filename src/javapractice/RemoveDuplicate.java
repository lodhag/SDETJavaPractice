package javapractice;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
	public static int[] removeDuplicates(int[] arr) {
		HashSet<Integer> uniqueSet = new HashSet<>();

		// Add elements to HashSet (duplicates will be ignored)
		for (int num : arr) {
			uniqueSet.add(num);
		}

		// Convert HashSet to an array
		int[] uniqueArr = new int[uniqueSet.size()];
		int index = 0;
		for (int num : uniqueSet) {
			uniqueArr[index++] = num;
		}

		return uniqueArr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 5, 6, 4, 7, 4, 3, 5, 1 };
		int[] uniqueArr = removeDuplicates(arr);

		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Array after Removing Duplicates: " + Arrays.toString(uniqueArr));
	}
}