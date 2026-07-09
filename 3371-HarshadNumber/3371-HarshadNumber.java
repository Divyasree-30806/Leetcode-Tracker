// Last updated: 7/9/2026, 3:07:40 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int num=0;
        while(x>0){
            int d=x%10;
            num=num+d;
            x/=10;
        }
        if(temp%num==0){
            return num;
        }else{
            return -1;
        }

        
    }
}