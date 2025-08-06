

class GfG {

    static boolean isSafe(char[][] grid, int r, int c, boolean[][] visited) {
        int row = grid.length;
        int col = grid[0].length;

        return (r >= 0) && (r < row) && (c >= 0) && 
               (c < col) && (grid[r][c] == 'L' && !visited[r][c]);
    }

    static void dfs(char[][] grid, int r, int c, boolean[][] visited) {

        int[] rNbr = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] cNbr = { -1, 0, 1, -1, 1, -1, 0, 1 };

        visited[r][c] = true;

        for (int k = 0; k < 8; ++k) {
            int newR = r + rNbr[k];
            int newC = c + cNbr[k];
            if (isSafe(grid, newR, newC, visited)) {
                dfs(grid, newR, newC, visited);
            }
        }
    }

    static int countIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];


        int count = 0;
        for (int r = 0; r < row; ++r) {
            for (int c = 0; c < col; ++c) {

                if (grid[r][c] == 'L' && !visited[r][c]) {

                    dfs(grid, r, c, visited);
                    

                    ++count;
                }
            }
        }
        return count;
    }

}
