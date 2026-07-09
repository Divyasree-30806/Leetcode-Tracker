// Last updated: 7/9/2026, 3:08:42 PM
class Solution {
    public int tribonacci(int n) {
        int F;
        if(n==0||n==1){
            return n;
        }else if(n==2){
            return 1;
        } 
        int pre1=0,pre2=1,pre3=1,next=0;
        for(int i=1;i<=n-2;i++){
            next=pre1+pre2+pre3;
            pre1=pre2;
            pre2=pre3;
            pre3=next;
        }
        return next;
    }
}
    


    

