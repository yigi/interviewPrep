package leetcode;


class Main {
    public static void main(String[] args) {
     
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
}

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        
        while (left < right) {
            int containerLength = right - left;
            int area = containerLength * Math.min(height[left], height[right]);
            res = Math.max(area,res);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}   
        
