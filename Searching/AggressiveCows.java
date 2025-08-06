class Solution {
    public static boolean canPlaceCows(int[] stalls,int k,int minDist){
        int count=1;
        int lastPos=stalls[0];
        
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastPos>=minDist){
                count++;
                lastPos=stalls[i];
                if(count==k){
                    return true;
                }
            }
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        
        int low=1;
        int high =stalls[stalls.length-1]-stalls[0];
        
        
        int best=0;
         
         
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPlaceCows(stalls,k,mid)){
                best=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return best;
        
    }
}
