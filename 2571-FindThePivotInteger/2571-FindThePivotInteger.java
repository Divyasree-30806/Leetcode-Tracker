// Last updated: 7/9/2026, 3:08:00 PM
class Solution {
    public int pivotInteger(int n) {
        for(int x = 1; x <= n; x++) {
            int left = 0;
            for(int i = 1; i <= x; i++) {
                left += i;
            }
            
            int right = 0;
            for(int j = x; j <= n; j++) {
                right += j;
            }
            
            if(left == right) {
                return x;
            }
        }
        return -1;
    }
}