package ArraysInterviewCodingQuestions;

import java.util.Arrays;

/*Input: arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}

Input: arr[] = {2, 3, 4, 5, 1}
Output: {1, 2, 3, 4, 5}*/

public class RotateArrayByOne {

	static int arr[] = new int[] { 1, 2, 3, 4, 5 };

	static void rotate() {
		int i = 0, j = arr.length - 1;
		while (i != j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
	}

	public static void main(String[] args) {

		rotate();
		System.out.println(Arrays.toString(arr));

	}

}