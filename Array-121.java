class Solution {
    public int maxProfit(int[] prices) {
        int tmp=0;
        for(int i=0;i<=prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]>prices[i])
                {
                    if(tmp<prices[j]-prices[i])
                        tmp=prices[j]-prices[i];
                }
            }
        }
        return tmp;
    }
}