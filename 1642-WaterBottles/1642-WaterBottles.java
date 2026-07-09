// Last updated: 7/9/2026, 3:08:26 PM
class Solution {
    public int numWaterBottles(int numb, int numex){
        int drink=numb;
        int empty=numb;
        while(empty>=numex){
            int  newD=empty/numex;
            empty=(empty%numex)+newD;
            drink+=newD;
        }
        return drink;
    }
}