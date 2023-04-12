package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.toLowerCase().split("[,. ]");
        for (String word : words) {
            if(!word.isEmpty() && !map.containsKey(word)) {
                map.put(word, 1);
            }
            else if(map.containsKey(word)){
                map.replace(word, map.get(word) + 1);
            }
        }
        return map;
    }
}
