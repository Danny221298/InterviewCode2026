package ArraysInterviewCodingQuestions;

import java.util.Arrays;

public class SumOfArrays {
	public static void main(String[] args) {

		int arr[] = {2,3,4,5,6};
		int sum = 0;

		for (int i = 0; i < arr.length ; i++) {

			sum = sum +arr[i];
		}

		System.out.println(sum);
		
		Integer l1 = Arrays.stream(arr).boxed().mapToInt(Integer::intValue).sum();
		
		System.out.println(l1);
	}

}
