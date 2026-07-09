// Last updated: 7/9/2026, 3:11:13 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totaltank=0;
        int currtank=0;
        int startstation=0;
        for(int i=0;i<gas.length;i++){
            totaltank+=gas[i]-cost[i];
            currtank+=gas[i]-cost[i];
            if(currtank<0){
                startstation=i+1;
                currtank=0;
            }
        }
        return totaltank>=0?startstation:-1;

        
    }
}