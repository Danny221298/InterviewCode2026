 package interviewcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenAndOddNumberSameTime {
	
	public static void main(String[] args) {
		
		int a1[] = { 23,21,45,66,77,87};
		
		Map<Boolean, List<Integer>> l1  = Arrays.stream(a1).boxed().collect(Collectors.partitioningBy(num->num%2==0));
		
		List<Integer> even = l1.get(true);
		List<Integer> odd = l1.get(false);
		
		System.out.println(even);
		System.out.println(odd);
	}

}
