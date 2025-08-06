import java.util.ArrayList;
import java.util.*;

class GfG {

    // Method to find the maximum for each
    // and every contiguous subarray of size k.
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        int n = arr.length;

        // to store the results
        ArrayList<Integer> res = new ArrayList<Integer>();
      
        for (int i = 0; i <= n - k; i++) {
      
            // Find maximum of subarray beginning
            // with arr[i]
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            res.add(max);
        }
      
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        ArrayList<Integer> res = maxOfSubarrays(arr, k);
        for (int maxVal : res) {
            System.out.print(maxVal + " ");
        }
    }
}
