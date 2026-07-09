// Last updated: 7/9/2026, 3:10:21 PM
class Solution {
    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vi = new boolean[m][n];

        int ans = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                if(grid[i][j] == '1' && !vi[i][j]) {
                    ans++;
                    bfs(vi, i, j, grid, m, n);
                }
            }
        }

        return ans;
    }

    void bfs(boolean[][] vi, int i, int j,
             char[][] grid, int m, int n) {

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{i, j});
        vi[i][j] = true;

        int[][] dir = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!q.isEmpty()) {

            int[] cur = q.poll();

            int x = cur[0];
            int y = cur[1];

            for(int k = 0; k < 4; k++) {

                int nextrow = x + dir[k][0];
                int nextcol = y + dir[k][1];

                if(nextrow >= 0 &&
                   nextrow < m &&
                   nextcol >= 0 &&
                   nextcol < n &&
                   !vi[nextrow][nextcol] &&
                   grid[nextrow][nextcol] == '1') {

                    vi[nextrow][nextcol] = true;
                    q.add(new int[]{nextrow, nextcol});
                }
            }
        }
    }
}
