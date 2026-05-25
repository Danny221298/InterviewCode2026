package EPAM;

import java.util.*;

public class GeetingIndicesForSum {
	
	public static void main(String[] args) {
		
		int [] arr1= {2,8,7,9,45,0};
		
		int target=9;
		
		int[] result = findindice(arr1, target);
		
		System.out.print(result[0]);
		System.out.print(result[1]);
	}
	
	static int[] findindice(int [] arr2 , int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0 ; i<arr2.length;i++) {
			int require = target -arr2[i];
			if(map.containsKey(require)) {
				return new int[] {map.get(require), i};
			}
			map.put(arr2[i], i);
		}
		
		return new int[]{-1,1};
	}

}
