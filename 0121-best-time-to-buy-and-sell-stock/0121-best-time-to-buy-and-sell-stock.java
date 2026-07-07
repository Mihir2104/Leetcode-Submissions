class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxp = 0;
        int min = prices[0];
        int cost = 0;

        for (int i =0; i < n ; i++){
            min = Math.min(min,prices[i]);
            cost = prices[i]-min;
            maxp = Math.max(cost,maxp);
        } 
       return maxp;

        }
    }
