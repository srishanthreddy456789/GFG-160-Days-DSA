class Solution {
    private  static final int maxchar=26;
    static char nonRepeatingChar(String s) {
        int[] freq=new int[maxchar];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(freq[c-'a']==1){
                return c;
            }
        }
        
        return '$';
    }
}

