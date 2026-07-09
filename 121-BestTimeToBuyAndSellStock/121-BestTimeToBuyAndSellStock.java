// Last updated: 7/9/2026, 3:11:17 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minbuyprice=prices[0];
        for(int i=1;i<prices.length;i++){
            int sp=prices[i];
            if(sp>minbuyprice){
                int profit=sp-minbuyprice;
                if(profit>maxp)maxp=profit;
            }else{
                minbuyprice=sp;
            }
        }
        return maxp;
    }
}
