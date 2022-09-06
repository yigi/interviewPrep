package leetcode;

//https://leetcode.com/problems/find-pivot-index/

class Main {
    public static void main(String[] args) {
     
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));

}

    public static int pivotIndex(int[] nums) {
        if(nums.length == 1) 
            return 1;
        
        int totalsum = 0;
        for(int i = 0; i<nums.length; i++){
            totalsum += nums[i];
        }
        
        int leftsum = 0;
        for(int i = 0; i < nums.length; i++){
            totalsum = totalsum - nums[i];
            if(leftsum == totalsum) 
                return i; 
            leftsum = leftsum + nums[i];
        
        }
        return -1;
    }
}