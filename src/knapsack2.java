public class knapsack2 {
    public static void main(String[] args) {

        int [] weight = {1,2,3,2,2};
        int [] value = {8,4,0,5,3};

        int capacity = 4;

        int k = knapsack(weight,value,capacity);

        System.out.println(k);
    }

    private static int knapsack(int[] weight, int[] value, int capacity){
        int n = weight.length;

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacity; j++){

            }
        }
    }
}
