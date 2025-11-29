package ArraysInterviewCodingQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		
 
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					System.out.println(arr1[i]);
				}
			}
		}

	}

	static void Union() {

		List<Integer> arr1 = List.of( 1, 3, 4, 5, 7 );
		List<Integer> arr2 = List.of( 2, 3, 4, 6 );
	
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
