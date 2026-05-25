package EPAM;

import java.util.*;

public class TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min Heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int num : map.keySet()) {

            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return new ArrayList<>(pq);
    }

    public static void main(String[] args) {

        int[] nums = {1,2,2,3,1,2,3,4};
        int k = 3;

        List<Integer> result = topKFrequent(nums, k);

        System.out.println("Top K Frequent Elements:" + result);
    }
}