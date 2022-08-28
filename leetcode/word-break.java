package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
     
        ArrayList<String> dict = new ArrayList<String>();
        dict.add("apple");
        dict.add("pie");
        dict.add("pine");
        dict.add("pen");
        System.out.println(word_break("penpineapplepenapple",dict));
}
  
        public static boolean word_break(String s, ArrayList<String> wordDict) {
            Set<String> set = new HashSet<>();
            for (String word : wordDict) {
                set.add(word);
            }
            for(String word : wordDict)
            {
                if( s.contains(word))
                {
                    s = s.replace(word,"");
                }
            }
            return s.isEmpty();

        }

}