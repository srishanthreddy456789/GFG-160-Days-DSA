// Java program to find the longest subarray where the
// absolute difference between any two elements is not
// greater than X

import java.util.*;

class GfG {

    // Function that prints the longest sub-array
    // where the absolute difference between any
    // two element is not greater than X
    static ArrayList<Integer> longestSubarray(int[] arr, int x) {
        
        int n = arr.length;
        
        int beginning = 0, maxLen = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                
                // Find minimum and maximum elements
                int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
                
                for (int k = i; k <= j; k++) {
                    mini = Math.min(mini, arr[k]);
                    maxi = Math.max(maxi, arr[k]);
                }
                
                // If difference is less than x,
                // compare length of subarray 
                if (maxi - mini <= x && maxLen < j - i + 1) {
                    maxLen = j - i + 1;
                    beginning = i;
                }
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = beginning; i < beginning + maxLen; i++) {
            res.add(arr[i]);
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 6, 7 };
        int x = 4;

        ArrayList<Integer> res = longestSubarray(arr, x);
        
        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
