package Arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int[] arr={2,5,1,7,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int cost = 0;
        for (int i = 1; i < prices.length; i++) {
            cost = prices[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
