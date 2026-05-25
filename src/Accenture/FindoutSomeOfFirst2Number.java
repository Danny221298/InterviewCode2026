package Accenture;

import java.util.Arrays;
import java.util.List;

public class FindoutSomeOfFirst2Number {

	public static void main(String[] args) {
	
		List<Integer> l1= Arrays.asList(23,21,34,56,21);
		
		Integer sum = l1.stream().limit(2)
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println("Sum of First 2 number :" +sum);
		
	}
}
