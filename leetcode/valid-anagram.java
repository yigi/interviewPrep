package leetcode;


class Main {
    public static void main(String[] args) {
     
        String s1 = "anagram";
        String s2 = "anargam";
        String s3 = "cat";
        String s4 = "car";
        System.out.println(valid_anagram(s1,s2));
        System.out.println(valid_anagram(s3,s4));
}

    private static boolean valid_anagram(String s1, String s2) {
        
        char[] alphabet = new char[26]; //alphabet size
        for (int i = 0; i < s1.length(); i++) alphabet[s1.charAt(i) - 'a']++;
        for (int i = 0; i < s2.length(); i++) alphabet[s2.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }

}