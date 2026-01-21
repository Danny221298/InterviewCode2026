package interviewcode;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestwithFunction {
	
	public static int secondLarge(int[] arr) {
		
		Integer a = Arrays.stream(arr).boxed().distinct().sorted(Comparator	.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(a);
		return a;
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,39,9,39};
		
		secondLarge(arr);
		
		
	}

}
