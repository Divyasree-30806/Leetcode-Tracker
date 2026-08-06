// Last updated: 8/6/2026, 11:31:52 AM
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3        int[][][] opt = new int[k+1][prices.length][2];
4        for (int i = 0; i < k+1; i ++) {
5            if(i == 0) {
6                continue;
7            } else {
8                for (int j = 0; j < prices.length; j ++) {
9                    if (j == 0) {
10                        opt[i][j][0] = 0;
11                        opt[i][j][1] = -prices[j];
12                    } else {
13                        opt[i][j][0] = Math.max(opt[i][j-1][0], opt[i][j-1][1] + prices[j]);
14                        opt[i][j][1] = Math.max(opt[i][j-1][1], opt[i-1][j-1][0] - prices[j]);
15                    }
16                }
17            }
18        }
19        return Math.max(opt[k][prices.length-1][0],opt[k][prices.length-1][1]);
20    }
21}