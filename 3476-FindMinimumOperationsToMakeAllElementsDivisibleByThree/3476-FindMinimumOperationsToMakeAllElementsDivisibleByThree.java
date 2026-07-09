// Last updated: 7/9/2026, 3:07:39 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int n=0;
        for(int num:nums){
            if(num%3!=0){
                n++;
            }
        }
            return n;
    }
}