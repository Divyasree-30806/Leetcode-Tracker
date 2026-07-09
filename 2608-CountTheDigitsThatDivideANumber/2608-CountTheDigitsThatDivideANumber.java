// Last updated: 7/9/2026, 3:07:57 PM
class Solution {
    public int countDigits(int num) {
        int count = 0;
        int d = 0;
        int originalNum = num; 

        while (num > 0) {
            d = num % 10;
            num = num / 10; 
            if (d != 0 && originalNum % d == 0) {
                count++;
            }
        }
        return count;
    }
}
