
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int n=arr.length;
        int result=Integer.MIN_VALUE;
        int l=1;
        int r=1;
        for(int i=0;i<n;i++){
            if(l==0)
              l=1;
            if(r==0)
              r=1;
              
              
            l*=arr[i];
            int j=n-i-1;
            r*=arr[j];
            result=Math.max(l,Math.max(r,result));
        }
        return result;
    }
}
