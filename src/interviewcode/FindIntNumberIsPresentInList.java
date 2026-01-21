package interviewcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class FindIntNumberIsPresentInList {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 4, 5 };

		int a2[] = { 5, 10, 15 };
		
		Integer l2 = Arrays.stream(a2).boxed().sorted().findFirst().get();
		
		System.out.println(l2);
		
		int a = 4;

		boolean s1 = Arrays.stream(a1).anyMatch(num -> num == a);

		System.out.println(s1);

		// Check if all number are divisble by 5

		boolean s2 = Arrays.stream(a2).allMatch(num -> num % 5 == 0);

		System.out.println(s2);
		
		
		long s3 = IntStream.range(1, 10).sum();
		
		System.out.println(s3);
	}

}
