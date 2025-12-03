class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int water = 0;
        int startMax = height[0];
        int endMax = height[end];

        while (start < end) {
            if (height[start] <= height[end]) {
                if (height[start] > startMax)
                    startMax = height[start];
                else
                    water = water + startMax - height[start];
                start++;
            } else {
                if (height[end] > endMax)
                    endMax = height[end];
                else
                    water = water + endMax - height[end];
                    end--;
            }
        }
        return water;
    }
}