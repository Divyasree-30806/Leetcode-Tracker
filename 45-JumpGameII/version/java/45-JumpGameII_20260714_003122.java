// Last updated: 7/14/2026, 12:31:22 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxInd = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (i > maxInd) {
7                return false;
8            }
9
10            maxInd = Math.max(maxInd, i + nums[i]);
11
12            if (maxInd >= nums.length - 1) {
13                return true;
14            }
15        }
16
17        return true;
18    }
19}