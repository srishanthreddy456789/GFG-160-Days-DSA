

import java.util.*;

class GfG {
     static
    ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;

        int cnt = 0;

        int totProfit = 0;
        ArrayList<int[]> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jobs.add(new int[]{profit[i], deadline[i]});
        }

        jobs.sort((a, b) -> Integer.compare(b[0], a[0]));

        int[] slot = new int[n];

        for (int i = 0; i < n; i++) {
            int start = Math.min(n, jobs.get(i)[1]) - 1;
            for (int j = start; j >= 0; j--) {

                if (slot[j] == 0) {
                    slot[j] = 1;
                    cnt++;
                    totProfit += jobs.get(i)[0];
                    break;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(cnt);
        result.add(totProfit);
        return result;
    }
}
