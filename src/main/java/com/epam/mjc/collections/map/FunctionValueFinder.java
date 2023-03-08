package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Integer i : functionMap.keySet()) {
            if (i==requiredValue||functionMap.get(i)==requiredValue){
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (Integer i : sourceList) {
            resultMap.put(i, 5 * i + 2);
        }
        return resultMap;
    }
}
