class GfG {
    
    
    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static int countPS(String s) {
        int n = s.length();

       
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
          
                
                if (isPalindrome(s, i, j)) 
                    res++;  
            }
        }

        return res;
    }
