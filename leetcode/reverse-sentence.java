package leetcode;

import java.util.Stack;

class Main {
    public static void main(String[] args) {
     
        System.out.println(reverse_sentence("Hello world!"));
    }
  
        public static String reverse_sentence(String s) {

            StringBuilder reversed_sentence = new StringBuilder();
            Stack<String> stack = new Stack<String>();
            String[] splited = s.split(" ");
            for(String word : splited)
            {
                stack.push(word);
            }
            
            while (!stack.isEmpty())
            {
                reversed_sentence.append(stack.pop() + " ");
            }

            return reversed_sentence.toString();
        }

}