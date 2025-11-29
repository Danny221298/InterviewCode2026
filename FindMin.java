package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class FindMin {

	public static void main(String[] args) {

		int a1[] = { 23, 43, 56, 12, 9 };

		Integer l1 = Arrays.stream(a1).boxed().sorted(Comparator.naturalOrder()).findFirst().get();
		System.out.println(l1);

		int min;
		min = a1[0];

		for (int i = 0; i < a1.length; i++) {

			if (a1[i] < min) {

				min = a1[i];
			}
		}
		System.out.println(min);
	}

}
