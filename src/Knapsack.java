public class Knapsack {
    public static void main(String[] args) {
        
        int [] weight = {1,2,3,2,2};
        int [] value = {8,4,0,5,3};
        
        int capacity = 4;

        int k = find(0,capacity,weight,value);
        
        System.out.println(k);
    }

    private static int find(int i, int capacity, int[] weight, int[] value) {

        if (i >= weight.length || 0 == capacity) {
            return 0;
        }

        int a = 0;
        if (capacity >= weight[i]) {
            a = value[i] + find(i + 1, capacity - weight[i], weight, value);
        }
        int b = find(i + 1, capacity, weight, value);

        return Math.max(a, b);
    }
}
