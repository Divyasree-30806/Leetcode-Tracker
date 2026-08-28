// Last updated: 8/28/2026, 9:44:44 AM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3
4        // Create a set of all words in the word list for quick lookup.
5        Set<String> wordSet = new HashSet<>(wordList);
6
7        // If endWord is not in the word set, no valid transformation exists.
8        if (!wordSet.contains(endWord)) {
9            return 0;
10        }
11
12        // Use a queue to perform BFS (Breadth-First Search).
13        Queue<String> wordQueue = new LinkedList<>();
14
15        // Start BFS with the beginWord.
16        wordQueue.add(beginWord);
17
18        // Distance from the beginWord (initially 1 since beginWord is counted).
19        int distance = 1;
20
21        // BFS loop: continue until the queue is empty.
22        while (!wordQueue.isEmpty()) {
23            int size = wordQueue.size();
24
25            // Process each word in the current level.
26            for (int i = 0; i < size; i++) {
27                String currWord = wordQueue.poll();
28
29                // If the current word is the endWord, return the distance.
30                if (currWord.equals(endWord)) {
31                    return distance;
32                }
33
34                // Try changing each character in the current word.
35                for (int j = 0; j < currWord.length(); j++) {
36                    char[] temp = currWord.toCharArray();
37
38                    // Replace the character at index j with every letter from 'a' to 'z'.
39                    for (char c = 'a'; c <= 'z'; c++) {
40                        temp[j] = c;
41                        String newWord = new String(temp);
42
43                        // If the new word is in the word set, add it to the queue.
44                        if (wordSet.contains(newWord)) {
45                            wordQueue.add(newWord);
46                            wordSet.remove(newWord); // Remove to prevent revisiting.
47                        }
48                    }
49                }
50            }
51
52            // Increment distance after processing the current level.
53            distance++;
54        }
55
56        // If no transformation sequence leads to the endWord, return 0.
57        return 0;
58    }
59}