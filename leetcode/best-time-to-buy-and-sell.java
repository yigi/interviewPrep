package leetcode;


class Main {
    public static void main(String[] args) {
     
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
}

    public static int maxProfit(int[] prices) {
        
        int buy = 0;
        int sell = prices.length - 1;
        int res = 0;
        
        while (buy < sell) {
            int profit = prices[sell] - prices[buy];
            res = Math.max(profit,res);
            if (prices[buy] < prices[sell]) {
                sell--;
            } else {
                buy++;
            }
        }
        return res;
    }
}   
        
