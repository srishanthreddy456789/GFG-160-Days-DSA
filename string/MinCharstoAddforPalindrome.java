class Solution {

    static int[] computeLPSArray(String pat) {
        int n = pat.length();
        int[] lps = new int[n];

        lps[0] = 0;
        int len = 0;

        int i = 1;
        while (i < n) {

            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }

            else {

                if (len != 0) {
                    len = lps[len - 1];
                }

                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    static int minChar(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();

        s = s + "$" + rev;

        int[] lps = computeLPSArray(s);

        return (n - lps[lps.length - 1]);
    }
}
