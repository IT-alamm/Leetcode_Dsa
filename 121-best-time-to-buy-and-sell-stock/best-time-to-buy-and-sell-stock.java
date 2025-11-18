class Solution {
    // public int maxProfit(int[] prices) {
    //     int min = Integer.MAX_VALUE; 
    //     int idx = 0;

    //     for(int i = 0; i<prices.length; i++){
    //         if(prices[i]<min){
    //             min=prices[i];
    //             idx = i;
    //         }
    //     }

    //     int maxProfit = 0;
    //     for(int j =idx+1; j<prices.length; j++){
    //        int profit = prices[j]-min;
    //        if(profit>maxProfit){
    //         maxProfit = profit;    
    //        }    
    //     }
    //     return maxProfit;
    // }
  public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;          // best buy
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice;  // best sell
        }
    }

    return maxProfit;
}


}