

class GfG {
    static int startStation(int[] gas, int[] cost) {
        int n = gas.length;
        int startIdx = -1;
        for (int i = 0; i < n; i++) {

            int currGas = 0;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                
                int idx = (i + j) % n;
                currGas = currGas + gas[idx] - cost[idx];
                
                if (currGas < 0) {
                    flag = false;
                    break;
                }
            }
            
        
            if (flag) {
                startIdx = i;
                break;
            }
        }
        
        return startIdx;
    }
 
}
