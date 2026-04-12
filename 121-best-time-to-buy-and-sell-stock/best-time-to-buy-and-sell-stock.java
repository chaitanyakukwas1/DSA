class Solution {
    public int maxProfit(int[] prices) 
    {
        //[7,1,5,3,6,4]
        // p

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices)
        {
            if(price<minPrice)
            {
                minPrice = price;
            }
            if(price -minPrice > maxProfit)
            {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;



















        // int min=prices[0];
        // int profit=0;

        // for(int i=0;i<prices.length;i++)
        // {
        //     if(prices[i]<min)
        //     {
        //         min=prices[i];
        //     }
        //     profit = Math.max(profit,prices[i]-min);
        // }
        // return profit;  
    }
}