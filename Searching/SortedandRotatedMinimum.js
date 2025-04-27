
class Solution {
    public int findMin(int[] arr) {
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            res=Math.min(arr[i],res);
        }
        return res;
    }
}
