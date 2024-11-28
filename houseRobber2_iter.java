import java.util.Arrays;

public class houseRobber2_iter {
                                            //  LEETCODE - 213
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int a = find(0, nums.length-2, nums);

        int b = find(1, nums.length-1, nums);

        System.out.println("Max Robbing Amount is : " + Math.max(a,b));
    }

    private static int find(int start, int end, int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

        dp[start] = nums[start];

        dp[start + 1] = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(nums[i]+ dp[i-2] , dp[i-1]);
        }

        return Math.max(dp[dp.length - 1], dp[dp.length - 2]);
    }
}