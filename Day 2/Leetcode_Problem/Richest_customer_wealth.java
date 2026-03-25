
public class Richest_customer_wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] a : accounts) {
            int sum = 0;
            for (int n : a) {
                sum += n;
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] account = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(account));
    }
}