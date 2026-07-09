// Last updated: 7/9/2026, 3:07:24 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;

        int l=0;
        int r=n-1;
        int mid=(l+r)/2;

        for(int i=0;i<mid;i++){
            if(nums[i]==nums[mid]){
                return false;
            }
        }

            for(int j=mid+1;j<n;j++){
                if(nums[j]==nums[mid]){
                    return false;
                }
            }
        return true;
    }
}