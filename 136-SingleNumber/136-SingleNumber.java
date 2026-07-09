// Last updated: 7/9/2026, 3:11:11 PM
class Solution {
    public int singleNumber(int[] nums) {
        int n=0;
        for(int i:nums){
            n^=i;
        }
        return n;
        
    }
}