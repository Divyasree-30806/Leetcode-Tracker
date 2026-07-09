// Last updated: 7/9/2026, 3:07:27 PM
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();

        sb.append(new StringBuilder(s.substring(0, k)).reverse());

        sb.append(s.substring(k));

        return sb.toString();
    }
}