class GfG {

    
    static int editDistRec(String s1, String s2, int m, int n) {

        
        if (m == 0) return n;

        
        if (n == 0) return m;

        
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) 
            return editDistRec(s1, s2, m - 1, n - 1);

        
        return 1 + Math.min(
                Math.min(editDistRec(s1, s2, m, n - 1),  
                         editDistRec(s1, s2, m - 1, n)),   
                editDistRec(s1, s2, m - 1, n - 1)); 
    }

   
    static int editDistance(String s1, String s2) {
        return editDistRec(s1, s2, s1.length(), s2.length());
    }

