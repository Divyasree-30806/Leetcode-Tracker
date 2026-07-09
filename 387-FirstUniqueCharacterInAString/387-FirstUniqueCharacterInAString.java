// Last updated: 7/9/2026, 3:09:50 PM
class Solution {
    public int firstUniqChar(String s) {
        int[]arr=new int[123];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
        if(arr[s.charAt(i)-'a']==1){
            return i;
        }
        }
        return -1;
        
    }
}       