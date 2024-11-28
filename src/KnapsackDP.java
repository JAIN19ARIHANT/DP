/*
 * Knapsack Problem:
 *         Given a set of items, each with a weight and a value, determine the maximum value that can be accommodated
 *         in a knapsack of a fixed capacity. The goal is to maximize the total value of the items in the knapsack
 *         without exceeding the given capacity.
 *
 *              This implementation uses dynamic programming to solve the Knapsack problem.
 */

import java.util.Arrays;
public class KnapsackDP {
    public static void main(String[] args) {

        int [] weight = {1,2,3,2,2};
        int [] value = {8,4,0,5,3};

        int capacity = 4;

        int[][] dp = new int[capacity + 1][weight.length + 1];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }

        int k = find(0,capacity,weight,value,dp);

        System.out.println(k);
    }

    private static int find(int i, int capacity, int[] weight, int[] value, int[][] dp) {

        if (i >= weight.length || 0 == capacity) {
            return 0;
        }

        if(dp[capacity][i] != -1){
            return dp[capacity][i];
        }

        int a = 0;
        if (capacity >= weight[i]) {
            a = value[i] + find(i + 1, capacity - weight[i], weight, value, dp);
        }
        int b = find(i + 1, capacity, weight, value, dp);

        dp[capacity][i] =  Math.max(a, b);

        return dp[capacity][i];
    }
}
