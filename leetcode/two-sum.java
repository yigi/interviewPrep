package leetcode;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
     
        Integer [] nums = {2,3,6,5};
        System.out.println(two_sum(nums,5));
}

    private static Integer[] two_sum(Integer[] nums, Integer target) {
        Integer[] returnArray = new Integer[2];
        Map<Integer, Integer> intMap = new HashMap<>();
        for(Integer i = 0; i<nums.length; i++)
            intMap.put(nums[i],i);

       for (Integer key : intMap.keySet()) 
       {
            if(intMap.containsValue(target-key))
            {
                returnArray[0] = intMap.get(key);
                returnArray[1] = intMap.get(target-key);
            }
       }
        return returnArray;
    }
}