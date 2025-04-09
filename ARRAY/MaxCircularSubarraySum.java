class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        int n=arr.length;
        int ss=arr[n-1];
        int[] ms =new int[n+1];
        ms[n-1]=arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            ss=ss+arr[i];
            ms[i]=Math.max(ms[i+1],ss);
        }
        int cs=arr[0];
        int ns=arr[0];
        int cus=0;
        int p=0;
        
        for(int i=0;i<n;i++){
            cus=Math.max(cus+arr[i],arr[i]);
            ns=Math.max(ns,cus);
            p=p+arr[i];
            cs=Math.max(cs,p+ms[i+1]);
        }
        return Math.max(cs,ns);
    }
}

