class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0;
        for(int x : prices){
            if(x<buy)
                buy = x;
            else if(x-buy>profit)
                profit = x-buy;
        }
        return profit;
    }
}