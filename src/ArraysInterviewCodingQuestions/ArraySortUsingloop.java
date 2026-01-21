 package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraySortUsingloop {

	public static void main(String[] args) {

		int a1[] = { 2,4,1,3,6,4,8,9};
		
		List<Integer> l1 = Arrays.stream(a1).boxed().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(l1);
		
		List<Integer> l2 = IntStream.rangeClosed(1, 9).filter(c->!l1.contains(c)).boxed().collect(Collectors.toList());
		
		System.out.println(l2);
		

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