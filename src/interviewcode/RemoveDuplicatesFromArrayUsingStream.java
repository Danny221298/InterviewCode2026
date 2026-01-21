package interviewcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayUsingStream {
	
	public static void main(String[] args) {
		
		int arr[] = {22,1,22,33,44,33};
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		List<Integer> l2 = Arrays.stream(arr).filter(a-> s1.add(a)).boxed().collect(Collectors.toList());
		
		List<Integer> l1 = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
		
		System.out.println(l1);
		
		System.out.println(l2);
	}

}
