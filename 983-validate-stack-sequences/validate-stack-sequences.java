class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int n = pushed.length;
        int j = 0;

        for(int x : pushed){
            st.push(x);
            while(!st.isEmpty() && j < n && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return j == n;
    }
}