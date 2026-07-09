// Last updated: 7/9/2026, 3:07:55 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int a=0;
        int b=0;
        for(int x:nums){
            a=a+x;

            while(x!=0){
                b+=x%10;
                x=x/10;
            }
        }
        return Math.abs(a-b);
    }
}
    
