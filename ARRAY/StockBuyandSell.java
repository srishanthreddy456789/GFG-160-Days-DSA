class GFG {
    static int maxProfit(int[] prices) {
        int n=prices.length;
        int res=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                res=Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }
}
