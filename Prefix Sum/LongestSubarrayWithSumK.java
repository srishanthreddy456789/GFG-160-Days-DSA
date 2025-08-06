// Java program to find the length of the longest
// subarray having sum k using nested loop
class GfG {
  
  	// Function to find longest sub-array having sum k
    static int longestSubarray(int[] arr, int k) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            
            // Sum of subarray from i to j
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
              
                // If subarray sum is equal to k
                if (sum == k) {
                  
                    // find subarray length and update result
                    int subLen = j - i + 1;
                    res = Math.max(res, subLen);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}
