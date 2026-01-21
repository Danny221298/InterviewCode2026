 package interviewcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArraysAndSort {

	public static void main(String[] args) {

		int[] a1 = { 23, 21, 45, 67 };
		int[] a2 = { 26, 71, 23 };
		
		List<Integer> l1 = Stream.concat(Arrays.stream(a1).boxed(), Arrays.stream(a2).boxed()).distinct().sorted().collect(Collectors.toList());
		
		System.out.println("With Stream " +l1);
		int[] a3 = new int[a1.length + a2.length];
		int cnt = 0;

		for (int i = 0; i < a1.length; i++) {
			a3[i] = a1[i];
			cnt++;
		}

		for (int j = 0; j < a2.length; j++) {
			a3[cnt++] = a2[j];
		}

		for (int i = 0; i < a3.length; i++)
			System.out.println(a3[i]);

		for (int i = 0; i < a3.length; i++) {
			for (int j = i; j < a3.length; j++) {

				if (a3[i] > a3[j]) {

					int temp = a3[i];
					a3[i] = a3[j];
					a3[j] = temp;
				}

			}

		}

		System.out.println("Arrays after sort and merging");

		for (int i = 0; i < a3.length; i++) {
			System.out.println(a3[i]);
		}
	}	
}