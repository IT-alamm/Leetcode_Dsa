class Solution {
    // public int largestRectangleArea(int[] heights) {
    // Brute force 
    // int n = heights.length;
    // int maxArea = 0;
    // for (int i = 0; i < n; i++) {
    //     int left = i;
    //     int right = i;
    //     while (left >= 0 && heights[left] >= heights[i])
    //         left--;
    //     while (right < n && heights[right] >= heights[i])
    //         right++;
    //     int area = heights[i] * (right - left - 1);
    //     maxArea = Math.max(area, maxArea);
    // }
    // return maxArea;

    // }

    // optimal solution
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = previousSmaller(heights);
        int[] nse = nextSmaller(heights);

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public int[] previousSmaller(int[] heights) {
        int n = heights.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }

    public int[] nextSmaller(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }
}