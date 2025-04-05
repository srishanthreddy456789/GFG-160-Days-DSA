class Solution {
    public int getSecondLargest(int[] arr) {
    int n=arr.length;  // to find the length of the array
    int largest = -1, secondlargest=-1;
    
    //the below loop is to find the largest number in array
    for(int i=0; i<n; i++){
        if(arr[i]>largest)
           largest = arr[i];
    }
    
    //the below loop is to fing the Second largest in array
    //And Second largest is not equal to the largest
    for(int i=0; i<n;i++){
        if(arr[i]>secondlargest && arr[i] != largest){
            secondlargest= arr[i];
        }
    }
    
    return secondlargest;
    }
}
