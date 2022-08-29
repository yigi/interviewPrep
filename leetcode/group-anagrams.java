package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Main {
    public static void main(String[] args) {
     
        String[] anagramList = new String[5];
        anagramList[0] = "anagram";
        anagramList[1] = "anargam";
        anagramList[2] = "cat";
        anagramList[3] = "tac";
        anagramList[4] = "car";
        
        System.out.println(group_anagrams(anagramList));
}

    private static List<List<String>> group_anagrams(String[] anagramList) {
        
        List<List<String>> result = new ArrayList<>();
        if (anagramList.length == 0) return result;

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : anagramList) {
            char[] hash = new char[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        result.addAll(map.values());
        return result;
    }
}