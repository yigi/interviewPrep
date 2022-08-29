package leetcode;

import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
     
        int[] age = {100,4,7,6,5,101,200};
        System.out.println(longest_consecutive(age));
}

    public static int longest_consecutive(int[] nums) {

        int max = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) 
        {
            set.add(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            
            int num = nums[i];
            System.out.println(num);
            while (set.contains(--num)) 
            {
                count++;
                System.out.println("1: "+num);
                set.remove(num);
            }
            
            num = nums[i];
            System.out.println(num);
            while (set.contains(++num)) 
            {
                count++;
                System.out.println("2: "+num);
                set.remove(num);
            }
            
            max = Math.max(max, count);
        }
    
    return max;
    }
}   
        
