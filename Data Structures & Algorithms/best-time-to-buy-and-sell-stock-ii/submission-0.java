class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = prices[0];
        int profit = 0;
        int sum = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                profit = profit + prices[i] - minPrice;
                sum = sum + profit;
                profit = 0;
                minPrice = prices[i];
            }
        }
        return sum;
    }
}