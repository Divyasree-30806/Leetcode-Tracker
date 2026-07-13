// Last updated: 7/14/2026, 12:27:12 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        int n = strs.length;
4
5        Map<String, List<String>> ans = new HashMap<>();
6
7        for(String s : strs){
8            int[] count = new int[26];
9
10            for(char ch : s.toCharArray()){
11                count[ch - 'a']++;
12            }
13
14            String str = Arrays.toString(count);
15
16            ans.putIfAbsent(str, new ArrayList<>());
17            ans.get(str).add(s);
18        }
19        return new ArrayList<>(ans.values());
20    }
21}