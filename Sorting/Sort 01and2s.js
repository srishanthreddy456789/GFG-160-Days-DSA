class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int n=arr.length;
        int q=0,w=0,e=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                q++;
            }
            else if(arr[i]==1){
                w++;
            }
            else{
                e++;
            }
        }
        for(int j=0;j<q;j++){
            arr[j]=0;
        }
        for(int j=q;j<q+w;j++){
            arr[j]=1;
        }
        for(int j=q+w;j<q+w+e;j++){
            arr[j]=2;
        }
        
    }
}
