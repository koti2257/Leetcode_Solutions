class Solution {
    public int maxProfit(int[] prices) {
        int minp = Integer.MAX_VALUE;
        int maxp = 0,profit ;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minp) {
                minp = prices[i];
            } else {
                profit = prices[i] - minp;
                if (profit > maxp) {
                    maxp = profit;
                }
            }
        }
        return maxp;
    }
}