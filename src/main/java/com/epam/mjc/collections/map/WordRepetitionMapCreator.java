package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        if (sentence == null || sentence.isEmpty()) {
            return resultMap;
        }
        for (String s : sentence.toLowerCase().replaceAll("[\\W&&\\S]", "").split(" ")) {
            if (!resultMap.containsKey(s)) {
                resultMap.put(s, 1);
            } else {
                resultMap.replace(s, resultMap.get(s) + 1);
            }
        }
        return resultMap;
    }
}
