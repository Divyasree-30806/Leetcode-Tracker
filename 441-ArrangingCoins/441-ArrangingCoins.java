// Last updated: 7/9/2026, 3:09:41 PM
class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        while(n>=row){
            n=n-row;
            row++;
        }
        return row-1;
    }
}