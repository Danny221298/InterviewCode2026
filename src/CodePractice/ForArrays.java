package CodePractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForArrays {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(12,-2,23,-6,54,-89,34,23);
		
		Integer l3= l1.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		
		//System.out.println(l3);
		
		int arr1[] = {9,2,32,4,43};
		
		//Sorted in number like 2493243
		//Arrays.stream(arr1).mapToObj(a->a).sorted().forEach(System.out::print);
		
		//get product of first 2 numbers
		long a1 = Arrays.stream(arr1).boxed().collect(Collectors.toList()).stream().limit(3).reduce(1, (a,b)->a*b);
		System.out.println(a1);
		
		
		// number is less than zero move right side
		List<Integer> l2 = Stream.concat(l1.stream().filter(s-> s<0), l1.stream().filter(a->a>0 )).collect(Collectors.toList());
		
		//System.out.println(l2);
	}

}


