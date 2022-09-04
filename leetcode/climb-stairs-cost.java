package leetcode;


class Main {
    public static void main(String[] args) {
     
        int[] step = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(climb_stairs_cost(step));
}

    private static int climb_stairs_cost(int[] cost) {

    int[] dp = new int[cost.length];
    dp[0] = cost[0];
    dp[1] = cost[1];
    
    for(int i = 2; i< cost.length; i++){
        dp[i] = Math.min(dp[i-1] + cost[i] , dp[i-2] + cost[i] );   
    }   

    // We return the min value of the last 2 stairs because both can reach the end
    return Math.min(dp[cost.length-1]  , dp[cost.length-2]  );
}
}
