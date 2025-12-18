# Cache (LRU & FIFO)

Small Java console project that implements a simple cache with string keys and integer values.

## Features

- `String` keys, `int` values
- Basic cache operations:
  - `put(String key, int value)`
  - `int get(String key)`
  - `void remove(String key)`
- Optional helpers:
  - `void clear()`
  - `int size()`
  - `boolean containsKey(String key)`
- Two eviction strategies:
  - **LRU (Least Recently Used)** – class `LruCache`
  - **FIFO (First In First Out)** – class `FifoCache`

## How to run

```bash
mvn compile 
mvn exec:java -Dexec.mainClass="org.example.Main"
