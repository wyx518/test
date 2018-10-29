class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++){
            if(low>prices[i])
                low = prices[i];
            else if(prices[i]-low>max)
                max = prices[i] - low;
        }
        return max;
    }
}