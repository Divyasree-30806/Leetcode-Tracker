// Last updated: 7/9/2026, 3:11:52 PM
class Solution {
    public void sortColors(int[] nums) {
        int zc=0,oc=0,n=nums.length;
        for(int num:nums){
            if(num==0)zc++;
            else if(num==1)oc++;
        }
        for(int i=0;i<zc;i++){
            nums[i]=0;
        }
        for(int i=zc;i<zc+oc;i++){
            nums[i]=1;

        }
        for(int i=zc+oc;i<n;i++){
            nums[i]=2;
        }      
    }
}