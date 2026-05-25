package EPAM;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10 };

		int index = Arrays.binarySearch(arr, 8);

        if(index >= 0) {
            System.out.println("Index: " + index);
            System.out.println("Element: " + arr[index]);
        } else {
            System.out.println("Element not found");
        }
    }
}
