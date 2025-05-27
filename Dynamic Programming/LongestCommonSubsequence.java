class GfG {


    static int lcsRec(String s1, String s2, int m, int n) {

        
        if (m == 0 || n == 0)
            return 0;

        
        if (s1.charAt(m - 1) == s2.charAt(n - 1))

  
            return 1 + lcsRec(s1, s2, m - 1, n - 1);

        else
           
            return Math.max(lcsRec(s1, s2, m, n - 1), lcsRec(s1, s2, m - 1, n));
    }
    static int lcs(String s1,String s2){
        int m = s1.length(), n = s2.length();
        return lcsRec(s1,s2,m,n);
    }
