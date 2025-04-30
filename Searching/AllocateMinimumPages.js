class Solution {
    static boolean check(int[] arr,int k,int pagel){
        int cnt=1;
        int pages=0;
        for(int i=0;i<arr.length;i++){
            if(pages+arr[i]>pagel){
                cnt++;
                pages=arr[i];
            }else{
                pages+=arr[i];
            }
        }
        return(cnt<=k);
    }
    public static int findPages(int[] arr, int k) {
        if(k>arr.length){
          return -1;
        }
          
          int lo=Arrays.stream(arr).max().getAsInt();
          int hi=Arrays.stream(arr).sum();
          int res=1;
          
          while(lo<=hi){
              int mid=lo+(hi-lo)/2;
              if(check(arr,k,mid)){
                  res=mid;
                  hi=mid-1;
              }else{
                  lo=mid+1;
              }
          }
          return res;
    }
}
