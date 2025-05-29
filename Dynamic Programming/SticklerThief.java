class GfG {
  
   
    static int maxLootRec(int[] arr, int n) {
    
        
        if (n <= 0) return 0;
      
         
        if (n == 1) return arr[0];

       
        int pick = arr[n - 1] + maxLootRec(arr, n - 2);
        int notPick = maxLootRec(arr, n - 1);

        
        return Math.max(pick, notPick);
    }

    
    static int findMaxSum(int[] arr) {
        int n = arr.length;
      
        
        return maxLootRec(arr, n);
    }
