package ArraysInterviewCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*input: arr1[] = {1, 3, 4, 5, 7}
arr2[] = {2, 3, 5, 6} 
Output: Union : {1, 2, 3, 4, 5, 6, 7} 
 Intersection : {3, 5}

Input: arr1[] = {2, 5, 6}
arr2[] = {4, 6, 8, 10} 
Output: Union : {2, 4, 5, 6, 8, 10} 
 Intersection : {6}*/
public class UnionAndIOntersection {

	public static void main(String[] args) {
		Intersector();
		Union();

	}

	static void Intersector() {

		int arr1[] = { 1, 3, 4, 5, 7 };
		int arr2[] = { 2, 3, 4, 6 };
		
		Set<Integer> s1 = new HashSet<Integer>();
 
		List<Integer> l2 = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).distinct().sorted().collect(Collectors.toList());
		
		List<Integer> l3 = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).filter(a->!s1.add(a)).collect(Collectors.toList());
		
		System.out.println("Union " +l2);
		
		System.out.println("Intersection " +l3);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					System.out.println(arr1[i]);
				}
			}
		}

	}

	static void Union() {

		List<Integer> arr1 = Arrays.asList( 1, 3, 4, 5, 7 );
		List<Integer> arr2 = Arrays.asList( 2, 3, 4, 6 );
	
		Set<Integer> s1 = new HashSet<Integer>();
		
		for(int i : arr1) {
			s1.add(i);
		}
		
		for(int i : arr2) {
			s1.add(i);
		}
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		for(int i : s1) {
			l1.add(i);
		}
		
		System.out.println(l1);
	}
 }
