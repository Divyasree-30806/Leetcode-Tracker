// Last updated: 7/9/2026, 3:08:58 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
    int[] answer = new int[n];
    Stack<Integer> stack = new Stack<>();
    
    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
            int prev = stack.pop();
            answer[prev] = i - prev;
        }
        stack.push(i);
    }
    
    return answer;
   }
}