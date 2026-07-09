// Last updated: 7/9/2026, 3:10:08 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[]ch=s.toCharArray();
        char[]ch1=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        return Arrays.equals(ch,ch1);
        
    }
}