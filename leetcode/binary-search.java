package leetcode;

//https://leetcode.com/problems/first-bad-version/
//https://leetcode.com/problems/search-insert-position

class Main {
    public static void main(String[] args) {
     
        int[] step = {1,2,3,4,5,6,7,8};
        System.out.println(search(step,7));
}

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
}
}