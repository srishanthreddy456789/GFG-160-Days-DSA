class Solution {
    public int maximumProfit(int prices[]) {
        int n=prices.length;
        int mins=prices[0];
        int res=0;
        
        for(int i=0;i<n;i++){
            mins=Math.min(mins,prices[i]);
            res=Math.max(res,prices[i]-mins);
        }
        return res;
    }
}
