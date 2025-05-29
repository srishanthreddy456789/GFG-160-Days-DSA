class GfG {

    static boolean evaluate(boolean b1, boolean b2, char op)
    {
        if (op == '&') {
            return b1 & b2;
        }
        else if (op == '|') {
            return b1 | b2;
        }
        return b1 ^ b2;
    }

    
    static int countRecur(int i, int j, boolean req,
                          String s)
    {

        
        if (i == j) {
            return (req == (s.charAt(i) == 'T')) ? 1 : 0;
        }

        int ans = 0;
        for (int k = i + 1; k < j; k += 1) {

            
            int leftTrue = countRecur(i, k - 1, true, s);
            int leftFalse = countRecur(i, k - 1, false, s);

            
            int rightTrue = countRecur(k + 1, j, true, s);
            int rightFalse = countRecur(k + 1, j, false, s);

            
            if (evaluate(true, true, s.charAt(k)) == req) {
                ans += leftTrue * rightTrue;
            }
            if (evaluate(true, false, s.charAt(k)) == req) {
                ans += leftTrue * rightFalse;
            }
            if (evaluate(false, true, s.charAt(k)) == req) {
                ans += leftFalse * rightTrue;
            }
            if (evaluate(false, false, s.charAt(k))
                == req) {
                ans += leftFalse * rightFalse;
            }
        }

        return ans;
    }

    static int countWays(String s)
    {

        int n = s.length();
        return countRecur(0, n - 1, true, s);
    }

