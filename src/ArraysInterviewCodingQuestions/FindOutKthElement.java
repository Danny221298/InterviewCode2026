package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7 

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
Output: 10 */


public class FindOutKthElement {
	
	public static void main(String[] args) {
		
		int arr[] = {7, 10, 4, 3, 20, 15};
		
		int a1[] = { 11, -13, -5, 6, -7, 5, -3, -6};
		
		List<Integer> l2 = Arrays.stream(a1).boxed().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		
		System.out.println(l2);
		
		 long k = 3;
		 
		 Integer l1 = Arrays.stream(a1).boxed().sorted(Comparator.naturalOrder()).skip(k -1).findFirst().get();
		 
		 System.out.println(l1);
	}

}
