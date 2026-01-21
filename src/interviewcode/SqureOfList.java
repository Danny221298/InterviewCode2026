package interviewcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SqureOfList {

	public static void main(String[] args) {

		int a1[] = {1,2,3,4,5,6};
		
		List<Integer> l1Integers = Arrays.stream(a1).boxed().map(a ->a *a).collect(Collectors.toList());
		
		System.out.println(l1Integers);
	}
}
