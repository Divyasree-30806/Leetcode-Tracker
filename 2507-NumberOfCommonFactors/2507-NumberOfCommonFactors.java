// Last updated: 7/9/2026, 3:08:05 PM
class Solution {
    public int commonFactors(int a, int b){
        int count = 0;
        int limit = Math.min(a, b);
        for (int x = 1; x <= limit; x++) {
            if (a % x == 0 && b % x == 0) {
                 count++; 
                 }
        }
        return count;
    }
}
