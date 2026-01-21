 package interviewcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCommanElementInArray {

	public static void main(String[] args) {

		int arr[] = { 20, 34, 1, 50 };
		int arr2[] = { 10, 59, 50, 31,34 };
		
		Set<Integer> s2 = new HashSet<Integer>(); 

	List<Integer> l2List = Arrays.stream(arr).filter(num -> Arrays.stream(arr2).anyMatch(num2 -> num2==num)).boxed().collect(Collectors.toList());

	List<Integer> s1 = Stream.concat(Arrays.stream(arr).boxed(), Arrays.stream(arr2).boxed()).filter(s->!s2.add(s)).collect(Collectors.toList());
	
	System.out.println(s1);
			
	System.out.println(l2List);
	
	for(int i = 0 ; i<arr.length; i++) {
		
		for(int j=0 ;j<arr2.length;j++) {
			
			if(arr[i] == arr2[j]) {
				
				//System.out.println(arr[i]);
			}
		}
		
	}
	}

}
