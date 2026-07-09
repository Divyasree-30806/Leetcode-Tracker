// Last updated: 7/9/2026, 3:07:42 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int i=0;i<=n;i++){
            if(i%m==0)
            num1+=i;
            else if(i%m!=0)
            num2=num2+i;
        }
        return num2-num1;
    }
}
            
        
