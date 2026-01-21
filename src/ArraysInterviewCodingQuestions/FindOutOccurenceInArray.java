package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutOccurenceInArray {
	
	public static void main(String[] args) {

		int a1[] = {4, 1, 2, 3, 4, 4, 4, 4, 4, 5, 5 };
		
		List<Integer> l1  = Arrays.stream(a1).distinct().sorted().boxed().collect(Collectors.toList());
		
		long l2 = Arrays.stream(a1).boxed().filter(a->a==4).collect(Collectors.counting());
		
		System.out.println(l2);
		
		System.out.println(l1);

		int x = 4;

		System.out.println(FindOccurence(a1, x));

	}

	static int FindOccurence(int a1[], int x) {

		int count = 0;

		for (int i = 0; i < a1.length; i++) {

			if (a1[i] == x) {

				count++;

			}

		}
		return count;
	}

}
