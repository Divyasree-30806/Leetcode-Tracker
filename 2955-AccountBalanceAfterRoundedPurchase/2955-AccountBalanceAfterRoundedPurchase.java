// Last updated: 7/9/2026, 3:07:44 PM
 class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int lastDigit = purchaseAmount % 10;
        int roundedAmount;
        if (lastDigit >= 5) {
            roundedAmount = purchaseAmount - lastDigit + 10;
        } else {
           
            roundedAmount = purchaseAmount - lastDigit;
        }
        
     
        return 100 - roundedAmount;
    }
 }

       
    
            
