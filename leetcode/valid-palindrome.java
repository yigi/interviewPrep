package leetcode;


class Main {
    public static void main(String[] args) {
     
        String palindrome1 = "race a car";
        String palindrome2 = " ";
        String palindrome3 = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(palindrome1));
        System.out.println(isPalindrome(palindrome2));
        System.out.println(isPalindrome(palindrome3));
}

public static boolean isPalindrome(String s) {
        if(s.equals(" "))
            return true;

        String onlyChars = s.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        
        int i = 0;
        int j = onlyChars.length() - 1;
        
        while(i < j)
        {
            if (onlyChars.charAt(i) != onlyChars.charAt(j)) {
                return false;
            }
            
            i++;
            j--;
            
        }
        return true;
}
}   
        
