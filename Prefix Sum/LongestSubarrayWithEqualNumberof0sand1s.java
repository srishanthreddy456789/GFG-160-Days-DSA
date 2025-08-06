// Java program to find the longest subarray with
// equal number of 0s and 1s using nested loop

import java.util.*;
class GfG {
    static int maxLen(int[] arr) {
        int res = 0;

        // Pick a starting point as 's'
        for (int s = 0; s < arr.length; s++) {
            int sum = 0;

            // Consider all subarrays arr[s...e]
            for (int e = s; e < arr.length; e++) {
                sum += (arr[e] == 0) ? -1 : 1;

                // Check if it's a 0-sum subarray
                if (sum == 0)
                    // Update max size
                    res = Math.max(res, e - s + 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(maxLen(arr));
    }
}
