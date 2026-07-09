// Last updated: 7/9/2026, 3:08:39 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evencost=0;
        int oddcost=0;
        for(int i:position){
            if(i%2==0){
                evencost+=1;
            }else{
                oddcost+=1;
            }
        }
        return evencost<oddcost?evencost:oddcost;
    }
}
      