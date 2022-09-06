package leetcode;

//https://leetcode.com/problems/two-sum/

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
     
        int [] nums = {2,3,6,5};
        System.out.println(two_sum(nums,5));
}

    private static int [] two_sum(int[] nums, int target) {
        
        int [] ans = new int[2];
        Map <Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target - nums[i])){
                ans[0] = hash.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            hash.put(nums[i],i);
        }
        return ans;
}
}