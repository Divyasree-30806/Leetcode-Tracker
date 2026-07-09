// Last updated: 7/9/2026, 3:07:18 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int squaresum=0;
        int digitsum=0;

        while(n>0){
            int dig= n%10;
            digitsum=digitsum+dig;
            squaresum=squaresum+(dig*dig);
            n/=10;
        }
        return(squaresum-digitsum)>=50;
    
        
    }
}