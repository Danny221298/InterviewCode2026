package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class FindMAx {

	public static void main(String[] args) {

		int arr[] = { 34, 33, 56, 76, 89, 98, 98, 98 };

		Integer s1 = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(s1);
		int max1, max2;

		max2 = max1 = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2) {

				arr[i] = max2;
			}
		}
		System.out.println(max2);
	}
}

// select *from employee group by salary order by salary desc limit 1,1;
 