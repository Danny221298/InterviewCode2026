package EPAM;

import java.util.*;

public class RemoveDuplicateFromArrays {

	public static void main(String[] args) {

		int[] arr = { 43,32,32,45 };

		for (int i = 0; i < arr.length; i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}