package Solution121;

public class solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int sellToday = prices[i];;
            if (prices[i] < min) {
                min = prices[i];
            }
            if (profit < sellToday - min) {
                profit = sellToday - min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        solution test = new solution();
        int[] prices = {7,6,4,3,1};
        System.out.println(test.maxProfit(prices));
    }
}
