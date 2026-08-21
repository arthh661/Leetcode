class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maximumprofit = 0;
        for (int i = 0 ;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            if(prices[i]>buy){
                 int profit = prices[i]-buy;
                    
                if (profit>maximumprofit){
                     maximumprofit = profit;
                }
            }

        }
        return maximumprofit;
        
    }
}