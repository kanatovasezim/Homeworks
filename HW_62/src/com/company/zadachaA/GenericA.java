package com.company.zadachaA;

import java.util.HashMap;
import java.util.Map;

public class GenericA<K, V> {
    private HashMap<K, V> hashMap = new HashMap<K, V>();

    public GenericA(K key, V value) {
        hashMap.put(key, value);

    }

    public void showKeyValue() {
        for (Map.Entry<K, V> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
