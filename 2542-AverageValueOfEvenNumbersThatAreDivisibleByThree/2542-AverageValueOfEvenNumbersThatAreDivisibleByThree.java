// Last updated: 7/9/2026, 3:08:03 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int n=0;
            for(int i:nums){
                if(i%2==0&&i%3==0){
                    sum=sum+i;
                    n++;
                }
            }
            return n==0?0:sum/n;
    }
}

