
class GfG {
    static void rotateMatrix(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[n - j - 1][i] = mat[i][j];
            }
        }


        for (int i = 0; i < n; i++) {
            System.arraycopy(res[i], 0, mat[i], 0, n);
        }
    }

