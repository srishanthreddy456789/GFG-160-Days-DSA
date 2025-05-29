class GfG {

    
    static int decodeHelper(String digits, int index)
    {

        int n = digits.length();

        
        if (index >= n) {
            return 1;
        }

        int ways = 0;

        
        if (digits.charAt(index) != '0') {
            ways = decodeHelper(digits, index + 1);
        }

        
        if ((index + 1 < n)
            && ((digits.charAt(index) == '1'
                 && digits.charAt(index + 1) <= '9')
                || (digits.charAt(index) == '2'
                    && digits.charAt(index + 1) <= '6'))) {

            ways += decodeHelper(digits, index + 2);
        }

        return ways;
    }

    
    static int countWays(String digits)
    {
        return decodeHelper(digits, 0);
    }

