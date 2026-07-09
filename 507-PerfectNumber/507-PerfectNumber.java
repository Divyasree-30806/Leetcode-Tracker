// Last updated: 7/9/2026, 3:09:35 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
          int sum=0;
        int d=num/2;
        for(int i=1;i<=d;i++)
        if(num%i==0)
        sum=sum+i;
        if(sum==num)
            return true;
        else
            return false;
        
    }
}