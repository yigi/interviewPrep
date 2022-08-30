package leetcode;

import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
     
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
}

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int longest = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(set.contains(s.charAt(i)))
            {
                count = 0;
                set.remove(s.charAt(i));
            }
            else
            {
                set.add(s.charAt(i));
                count++;
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }
    
}   
        

