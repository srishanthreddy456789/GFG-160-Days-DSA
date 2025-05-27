public class GfG {

    
    static boolean isPred(String a, String b) {
        if (a.length() != b.length() + 1) return false;
        int i = 0, j = 0;
        
        
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) { 
                i++; 
                j++; 
            } else { 
                i++; 
            }
        }
        return (j == b.length());
    }

    
    static int longestEndCurr(String[] words, String curr) {
        int maxEnd = 1;
        
        
        for (String w : words) {
            if (isPred(curr, w)) {
                
                maxEnd = Math.max(maxEnd, 1 + longestEndCurr(words, w));
            }
        }
        return maxEnd;
    }

    
    static int longestStringChain(String[] words) {
        int res = 1;
        
        
        for (String w : words) {
            res = Math.max(res, longestEndCurr(words, w));
        }
        return res;
    }

