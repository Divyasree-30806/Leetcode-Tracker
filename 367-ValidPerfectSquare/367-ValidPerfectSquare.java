// Last updated: 7/9/2026, 3:09:52 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int x=num;
            long left=1;
            long right=x;
            while(left<=right){
                long mid=(left+right)/2;
                if(mid*mid==x){
                    return true;
                }else if(mid*mid<x){
                    left=mid+1;
                }else if(mid*mid>x){
                    right=mid-1;
                }
                
            }
            return false;
    }
}