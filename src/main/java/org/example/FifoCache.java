package org.example;

import java.util.LinkedHashMap;
import java.util.Map;


public class FifoCache implements Cache {

    private final int capacity;
    private final LinkedHashMap<String, Integer> map;

    public FifoCache(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be > 0");
        }
        this.capacity = capacity;


        this.map = new LinkedHashMap<String, Integer>(capacity, 0.75f, false) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                // как только превышаем capacity — удаляем самый первый добавленный элемент
                return size() > FifoCache.this.capacity;
            }
        };
    }

    @Override
    public void put(String key, int value) {
        map.put(key, value);
    }

    @Override
    public int get(String key) {
        Integer value = map.get(key);
        return value != null ? value : -1;
    }

    @Override
    public void remove(String key) {
        map.remove(key);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}

