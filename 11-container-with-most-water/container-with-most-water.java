class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;

        while(start<end){
            int w = end-start;
            int h;
            if(height[start]<=height[end]){
                h = height[start++];
            }else{
                h = height[end--];
            }
            int area = w * h;
            if(area > maxArea)
                maxArea = area;
        }
        return maxArea;  
    }
}