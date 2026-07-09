// Last updated: 7/9/2026, 3:12:55 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int res=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
        
    }
}