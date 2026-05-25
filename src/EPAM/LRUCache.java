package EPAM;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public LRUCache(int capacity) {
        // true -> access order (LRU)
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    // Return value for key
    public int getValue(int key) {
        return super.getOrDefault(key, -1);
    }

    // Insert key-value
    public void putValue(int key, int value) {
        super.put(key, value);
    }

    // Remove least recently used entry
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

        cache.putValue(1, 10);
        cache.putValue(2, 20);

        //System.out.println(cache.getValue(1)); // 10

        cache.putValue(3, 30); // removes key 2

       // System.out.println(cache.getValue(2)); // -1

        cache.putValue(4, 40); // removes key 1
        
        cache.putValue(5, 50);

        System.out.println(cache.getValue(1)); // -1
        System.out.println(cache.getValue(2)); //-1
        System.out.println(cache.getValue(3)); // -1
        System.out.println(cache.getValue(4)); // 40
        System.out.println(cache.getValue(5)); // 40
    }
}
