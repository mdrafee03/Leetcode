class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            int minHeight = Math.min(height[i], height[j]);
            water = Math.max(water, (j-i) * minHeight);
            if (height[i] < height[j]) {
                while(i < j && height[i] <= minHeight) i++;
            } else {
                while(j > i && height[j] <= minHeight) j--;
            }
        }
        return water;
    }
}