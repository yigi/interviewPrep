package leetcode;

//https://leetcode.com/problems/running-sum-of-1d-array

class Main {
    public static void main(String[] args) {
     
        int[] nums = {1,2,3,4};
        System.out.println(runningSum(nums));

}

    public static int[] runningSum(int[] nums) {
        int [] temp = new int [nums.length];
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            tmp += nums[i];
            temp[i] = tmp;
        }
        return temp;
    }
}