// Last updated: 7/9/2026, 3:07:51 PM
class Solution {
    public int distinctIntegers(int n) {
        if(n==1){
            return 1;
        }
        int count=0;
        for(int i=2;i<=n;i++){
            count++;
        }
        return count;
        
    }
}