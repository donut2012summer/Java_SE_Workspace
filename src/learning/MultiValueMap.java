package learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiValueMap<K, V> {

    private final Map<K, List<V>> map;

    public MultiValueMap() {
        this.map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public List<V> get(K key) {
        return map.getOrDefault(key, new ArrayList<>());
    }

    public static void main(String[] args) {
        MultiValueMap<String, Integer> multiValueMap = new MultiValueMap<>();

        multiValueMap.put("key1", 1);
        multiValueMap.put("key1", 2);
        multiValueMap.put("key2", 3);
        multiValueMap.put("key2", 4);

        System.out.println("Values for key1: " + multiValueMap.get("key1"));
        System.out.println("Values for key2: " + multiValueMap.get("key2"));
        System.out.println("Values for key3: " + multiValueMap.get("key3"));
    }
}

