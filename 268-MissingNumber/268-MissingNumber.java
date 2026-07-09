// Last updated: 7/9/2026, 3:10:03 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int x : nums) {
            sum += x;
        }

        int expected = n * (n + 1) / 2;

        return expected - sum;
    }
}

    