class GfG {
    static int maxLootRec(int[] arr, int n, int[] memo) {
        if (n <= 0) return 0;
        if (n == 1) return arr[0];

   
        if (memo[n] != -1) return memo[n];

        int pick = arr[n - 1] + maxLootRec(arr, n - 2, memo);
        int notPick = maxLootRec(arr, n - 1, memo);

       
        memo[n] = Math.max(pick, notPick);
        return memo[n];
    }


    static int findMaxSum(int[] arr) {
        int n = arr.length;
      

        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return maxLootRec(arr, n, memo);
    }

