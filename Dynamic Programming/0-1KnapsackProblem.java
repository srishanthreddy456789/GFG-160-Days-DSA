class GfG {

    
    static int knapsackRec(int W, int[] val, int[] wt, int n) {

      
        if (n == 0 || W == 0)
            return 0;

        int pick = 0;

        
        if (wt[n - 1] <= W)
            pick = val[n - 1] + knapsackRec(W - wt[n - 1], val, wt, n - 1);
        
        
        int notPick = knapsackRec(W, val, wt, n - 1);
         
        return Math.max(pick, notPick);
    }

    static int knapsack(int W, int[] val, int[] wt) {
        int n = val.length;
        return knapsackRec(W, val, wt, n);
    }
