class GfG {

    static int minJumpsRecur(int i, int[] arr) {
        
        
        if (i >= arr.length - 1)
            return 0;

        
        int ans = Integer.MAX_VALUE;
        for (int j = i + 1; j <= i + arr[i]; j++) {
            int val = minJumpsRecur(j, arr);
            if (val != Integer.MAX_VALUE)
                ans = Math.min(ans, 1 + val);
        }

        return ans;
    }

    static int minJumps(int[] arr) {

        int ans = minJumpsRecur(0, arr);
        
        
        if (ans == Integer.MAX_VALUE) 
            return -1;
            
        return ans;
    }

