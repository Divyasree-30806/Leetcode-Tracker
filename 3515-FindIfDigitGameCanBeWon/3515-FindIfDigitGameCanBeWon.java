// Last updated: 7/9/2026, 3:07:37 PM
public class Solution {
    public static boolean canAliceWin(int[] nums) {
        int single = 0, doubl = 0, total = 0;

        for (int n : nums) {
            total += n;
            if (n < 10) 
                single += n;   // 1 to 9
            else if (n < 100) 
                doubl += n;    // 10 to 99
        }

        return (single > total - single) || (doubl > total - doubl);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,14};
        System.out.println(canAliceWin(nums));  // true
    }
}
