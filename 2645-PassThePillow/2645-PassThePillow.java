// Last updated: 7/9/2026, 3:07:53 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int remainingTime = time % cycle;

        if (remainingTime < n) { // still going forward
            return 1 + remainingTime;
        } else { // going backward
            return n - (remainingTime - (n - 1));
        }
    }
}