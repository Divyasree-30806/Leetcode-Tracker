// Last updated: 7/9/2026, 3:08:37 PM
class Solution {
    public boolean checkStraightLine(int[][] coord) {
        int x=coord[0][0];
        int y=coord[0][1];
        int x1=coord[1][0];
        int y1=coord[1][1];
        for(int i=1;i<coord.length;i++){
            int x2=coord[i][0];
            int y2=coord[i][1];
            if(((x-x1)*(y2-y1))!=((y-y1)*(x2-x1)))
            return false;
        }
        return true;
    }
}
