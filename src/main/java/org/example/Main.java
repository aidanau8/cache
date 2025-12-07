package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== LRU cache demo ===");
        Cache lru = new LruCache(3);
        lru.put("a", 1);
        lru.put("b", 2);
        lru.put("c", 3);
        System.out.println("Initial LRU: " + lru);


        lru.get("a");
        System.out.println("After get(a): " + lru);


        lru.put("d", 4);
        System.out.println("After put(d,4): " + lru);

        System.out.println();
        System.out.println("=== FIFO cache demo ===");
        Cache fifo = new FifoCache(3);
        fifo.put("a", 1);
        fifo.put("b", 2);
        fifo.put("c", 3);
        System.out.println("Initial FIFO: " + fifo);


        fifo.get("a");
        System.out.println("After get(a): " + fifo);


        fifo.put("d", 4);
        System.out.println("After put(d,4): " + fifo);
    }
}
