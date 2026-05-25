package ArraysInterviewCodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesInArray {

	public static void main(String[] args) {

		int a1[] = { 23, 21, 46, 43, 45 ,45,43};

		Set<Integer> s1Integers = new HashSet<Integer>();
		
		List<Integer> I1 = Arrays.stream(a1).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
				.stream().filter(a->a.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(I1);


		Integer l2Integers = Arrays.stream(a1).boxed().sorted(Comparator.reverseOrder()).findFirst().get();

		System.out.println(l2Integers);
		
		for(int  i = 0 ; i< a1.length;i++) {
			for(int  j = i+1 ; j< a1.length;j++) {
				if(a1[i]==a1[j]) {
					
					System.out.println(a1[i]);
				}
				
			}
		}

	}
}
