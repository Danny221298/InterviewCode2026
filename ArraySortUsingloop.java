package com.ArraysInterviewCodingQuestions;

public class ArraySortUsingloop {

	public static void main(String[] args) {

		int a1[] = { 2, 6, 7, 1, 3, 3 };

		for (int i = 0; i < a1.length; i++) {
			for (int j = i; j < a1.length; j++) {

				if (a1[i] > a1[j]) {
					int temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;

				}
			}

		}

		System.out.println("Arrays after sorting");

		for (int i = 0; i < a1.length; i++) {

			System.out.println(a1[i]);
		}
	}
}