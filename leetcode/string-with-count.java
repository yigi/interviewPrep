package leetcode;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
     
        String s1 = "accbbbbeeeeffggg";
        System.out.println(stringCount(s1));
}

    private static String stringCount(String s1) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s1.length(); i++) {
            if(map.containsKey(s1.charAt(i)))
            {
                int value = map.get(s1.charAt(i));
                map.put(s1.charAt(i), value + 1);
            }
            else
            {
                map.put(s1.charAt(i), 1);
            }
        }

        for (int i = 0; i < s1.length(); i += map.get(s1.charAt(i))) {
            sb.append(s1.charAt(i));
            sb.append(map.get(s1.charAt(i)));
        }

        return sb.toString();
    }

}