package leetcode;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
     
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(three_sum(nums));
}

    public static List<List<Integer>> three_sum(int[] nums) {

        List<List<Integer>> listOfList = new ArrayList<>();
        
        
        for(int i = 0; i<nums.length-2; i++){
            for(int j = 1; j<nums.length-1; j++)
            {
                List<Integer> list = new ArrayList<>();
                int first = nums[i];
                int second = nums[j];
                int third = nums[j+1];
                if(first + second + third == 0){
                    list.add(first);
                    list.add(second);
                    list.add(third);
                    listOfList.add(list);
                }
            }
        }
            return listOfList;
    }
}   
        
