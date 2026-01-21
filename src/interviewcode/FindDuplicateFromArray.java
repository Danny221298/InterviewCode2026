package interviewcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateFromArray extends RuntimeException{

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,1, 2, 3, 4, 4);

		Set<Integer> s = new HashSet<>();
		List<Integer> l1 = list.stream().filter(a -> !s.add(a)).collect(Collectors.toList());
		
		
		System.out.println(l1);
	}
}
