package leetcode;

import java.util.Stack;

class Main {
    public static void main(String[] args) {
     
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));

}

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[' )
            {
                stack.push(s.charAt(i));
            }            
            else if(stack.isEmpty()){
                return false;
            }
            else if(s.charAt(i) == '}' && stack.pop() != '{')
            {
                return false; 
            }
            else if(s.charAt(i) == ')' && stack.pop() != '(')
            {
                return false; 
            }
            else if(s.charAt(i) == ']' && stack.pop() != '[')
            {
                return false; 
            }
        }
        
        return stack.isEmpty();
    }
    
}   
        

