class Solution {

    // Brute Force Solution.

    // public int calculateProfit(int[] prices){
    //     int profit = 0;
        
    //     for(int i = 0; i< prices.length-1; i++){
    //         for(int j = i+1; j<prices.length;j++){
    //             profit = Math.max(profit, prices[j]-prices[i]);
    //         }
    //     }

    //     return profit;
    // }

    // Better Approach
    public int calculateProfit(int[] prices){

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(buyPrice > price){
                buyPrice = price;
            }
            else{
                maxProfit = Math.max(maxProfit, price-buyPrice);
            }
        }
    return maxProfit;
    }

    public int maxProfit(int[] prices) {
        return calculateProfit(prices);
    }
}
