import java.util.Arrays;
public class houseRobber2_rec {
                                        //  LEETCODE - 213
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

        int a = find(0,nums.length-1,nums,dp);

        Arrays.fill(dp,-1);

        int b = find(1,nums.length,nums,dp);

        System.out.println("Max robbing amount is : " + Math.max(a,b));
    }

    private static int find(int start, int end, int[] nums, int[] dp){

        if(start >= end){
            return 0;
        }

        if(dp[start] != -1){
            return dp[start];
        }

        int rob = nums[start] + find(start+2, end, nums, dp);

        int noRob = 0 + find(start+1, end, nums, dp);

        dp[start] = Math.max(rob, noRob);

        return dp[start];
    }
}