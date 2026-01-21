package interviewcode;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Integer a = Arrays.stream(arr).sum();

		System.out.println(a);

	}
}
