// Last updated: 7/9/2026, 3:07:16 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int n=nums.length;

        int max=-1;
        int sum = 0;

        for(int i:nums){
            int temp =i;
            int maxDigit=0;
            int minDigit=9;

            if(temp==0){
                minDigit=0;
            }
            while(temp>0){
                int dig= temp%10;
                if(dig>maxDigit) maxDigit=dig;
                if(dig<minDigit) minDigit=dig;
                temp/=10;
            }
            int curr= maxDigit-minDigit;

            if(curr > max){
                max=curr;
                sum=i;
            }else if(curr== max){
                sum+=i;
            }
                
        }
        return sum;
    }
}