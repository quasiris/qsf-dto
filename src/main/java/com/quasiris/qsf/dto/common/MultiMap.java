package com.quasiris.qsf.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultiMap<K, V> implements Serializable {
    private Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<V>());
        map.get(key).add(value);
    }

    public void putIfAbsent(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>());
        if (!map.get(key).contains(value)) {
            map.get(key).add(value);
        }
    }

    public List<V> get(Object key) {
        return map.get(key);
    }

    public Set<K> keySet() {
        return map.keySet();
    }

    public Set<Map.Entry<K, List<V>>> entrySet() {
        return map.entrySet();
    }

    public Collection<List<V>> values() {
        return map.values();
    }

    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    public Collection<V> remove(Object key) {
        return map.remove(key);
    }

    public boolean remove(K key, V value) {
        if (map.get(key) != null) // key exists
            return map.get(key).remove(value);

        return false;
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }
}
