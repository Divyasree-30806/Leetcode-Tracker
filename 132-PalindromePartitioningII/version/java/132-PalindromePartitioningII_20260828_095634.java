// Last updated: 8/28/2026, 9:56:34 AM
1class Solution {
2    public int minCut(String s) {
3        char[] c = s.toCharArray();
4        int n= c.length;
5        int[] cut=new int[n];
6        boolean[][] p = new boolean[n][n];
7
8        for(int i=0;i<n;i++){
9            int min=i;
10            for(int j=0;j<=i;j++){
11                if(c[j] == c[i] && (j + 1 > i -1 || p[j + 1][i -1])){
12                    p[j][i] =true;
13                    min=j==0?0:Math.min(min,cut[j-1]+1);
14                }
15            }
16            cut[i]=min;
17        }
18        return cut[n-1];
19    }
20}