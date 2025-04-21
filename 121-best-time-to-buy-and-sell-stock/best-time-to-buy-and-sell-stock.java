class Solution {
    public int maxProfit(int[] prices) {
        int minp=Integer.MAX_VALUE,maxp=0;
        for(int price:prices)
        {
           minp=Math.min(minp,price);
           maxp=Math.max(maxp,price-minp);
        }
        return maxp;
    }
}