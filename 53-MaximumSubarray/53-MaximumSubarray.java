// Last updated: 7/9/2026, 3:12:16 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxnum=nums[0];
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum=currsum+nums[i];
            if(currsum>maxnum)
             maxnum=currsum;
            if(currsum<0)
             currsum=0;
        }
        return maxnum;
    }
}
    