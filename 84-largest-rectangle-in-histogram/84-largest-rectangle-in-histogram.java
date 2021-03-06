class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] lessFromLeft = new int[heights.length];
        int[] lessFromRight = new int[heights.length];
        lessFromLeft[0] = -1;
        lessFromRight[heights.length -1] = heights.length;
        int maxArea = 0;
        for(int i = 1; i < heights.length; i++) {
            int p = i-1;
            while(p >= 0 && heights[p] >= heights[i]) p = lessFromLeft[p];
            lessFromLeft[i] = p;
        }
        for(int i = heights.length - 2; i >= 0; i--) {
            int p = i+1;
            while(p < heights.length && heights[p] >= heights[i]) p = lessFromRight[p];
            lessFromRight[i] = p;
        }
        for(int i=0; i <heights.length; i++) {
            maxArea = Math.max(maxArea, (lessFromRight[i] - lessFromLeft[i] - 1) * heights[i]);
        }
        return maxArea;
    }
}