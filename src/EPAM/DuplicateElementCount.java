package EPAM;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementCount {
	public static void main(String[] args) {
        int[] arr = {0, 1, 13, 2, 0, 6,1};

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print elements with their counts (only repeated)
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " appears " + map.get(key) + " times");
            }
        }
    }

}
