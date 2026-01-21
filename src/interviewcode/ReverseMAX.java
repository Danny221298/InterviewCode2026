package interviewcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseMAX {
	
	public static void main(String[] args) {
		
		int arr[] = {56,67,98,54,67,23,99};
		
		List<Integer> s1 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList());
	
		Integer s2 = Arrays.stream(arr).boxed().filter(a->a%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(s1);
		System.out.println(s2);
	}

}