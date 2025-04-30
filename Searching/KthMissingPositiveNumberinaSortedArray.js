class Solution {
    public int kthMissing(int[] arr, int k) {
        Set<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int c=0,r=0;
        
        while(c<k){
            r++;
            if(!set.contains(r)){
                c++;
            }
        }
        return r;
    }
}
