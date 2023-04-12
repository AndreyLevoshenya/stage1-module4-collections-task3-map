package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.toLowerCase().split("[,. ]");
        for (String word : words) {
            if(!map.isEmpty()) {
                if(!map.containsKey(word) && !word.isEmpty()) {
                    map.put(word, 1);
                }
                else {
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        if(entry.getKey().equals(word)) {
                            entry.setValue(entry.getValue() + 1);
                        }
                    }
                }
            }
            else if(!word.isEmpty()){
                map.put(word, 1);
            }
        }
        return map;
    }
}
