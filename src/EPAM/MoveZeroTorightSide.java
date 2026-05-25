package EPAM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroTorightSide {

	public static void main(String[] args) {

		int[] arr = { 0, 43, 0, 32, 32, 45 };
		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				j++;
			}
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		
		List<Integer> l1 = Stream.concat(Arrays.stream(arr).boxed().filter(a->a !=0), Arrays.stream(arr).boxed().filter(a->a ==0)).collect(Collectors.toList());
		
		System.out.println(l1);
		
		
	}
}