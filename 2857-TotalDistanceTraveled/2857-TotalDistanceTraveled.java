// Last updated: 7/9/2026, 3:07:46 PM
class Solution {
    public int distanceTraveled(int mt, int at) {
        int total=0;
        while(mt>=5){
            if(mt>=5){
            total+=50;
            mt-=5;
            }
        if(at>=1){
            mt++;
            at--;
        }
        }
        return total+(mt*10);
        
    }
}