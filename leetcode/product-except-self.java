package leetcode;


class Main {
    public static void main(String[] args) {
     
        int[] age = {1,2,3,4};
        System.out.println(product_except_self(age));
}

    public static int[] product_except_self(int[] nums) {
       
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }

        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;

    }
}   
        
