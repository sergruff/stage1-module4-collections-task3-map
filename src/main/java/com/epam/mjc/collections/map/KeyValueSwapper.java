package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (int temp : sourceMap.keySet()) {
            resultMap.put(sourceMap.get(temp), temp);
        }
        return resultMap;
    }
}
