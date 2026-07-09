// Last updated: 7/9/2026, 3:08:33 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,product=1;
        while(n>0){
            product=product*(n%10);
            sum=sum+(n%10);
            n=n/10;
        }
        return product-sum;

        
    }
}