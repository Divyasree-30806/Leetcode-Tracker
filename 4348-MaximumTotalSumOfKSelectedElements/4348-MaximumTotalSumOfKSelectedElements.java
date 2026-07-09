// Last updated: 7/9/2026, 3:07:20 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int a=nums.length;
        Arrays.sort(nums);

        long sum=0;
        for(int i=0;i<k;i++){
            long curr=nums[a-1-i];
            if(mul>1){
                sum+=curr*mul;
                mul--;
            }else{
                sum+=curr;
            }
        }
        return sum;
    }
}