import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the number for up-to which you want to find the fibonacci Sequence : ");
        int n = sc.nextInt();

        System.out.print("Fibonacci using pure Recursion : ");
        System.out.println(fiboRec(n)+"\n");

        System.out.print("Fibonacci using DP Recursion (Top-Down Approach) : ");
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fiboTD(n,dp));       // fibonacci top-down


        System.out.println(Arrays.toString(dp) + "\n");


        System.out.print("Fibonacci using DP Recursion (Bottom-Up Approach) : ");
        fiboBU(n,dp);                           // fibonacci bottom-up
    }


    private static void fiboBU(int n, int[] dp){
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(Arrays.toString(dp));
    }


    private static int fiboTD(int n, int[] dp){
        if(0 == n || 1 == n){
            dp[n] = n;
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int a = fiboTD(n-1, dp);
        int b = fiboTD(n-2, dp);

        dp[n] = a + b;
        return dp[n];
    }

    private static int fiboRec(int n){
        if(n == 0 || n == 1)    return n;

        int a = fiboRec(n-1);
        int b = fiboRec(n-2);

        return a+b;
    }
}
