class Solution {
    public void reverseArray(int arr[]) {
        int left=0,right=arr.length-1;
        
        int  temp;
        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right--;
            left++;
        }
        
    }
}
