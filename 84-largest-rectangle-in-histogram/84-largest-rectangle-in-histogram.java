class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stackRight = new Stack<Integer>();
        int[] leftSmall = new int[heights.length];
        int[] rightSmall = new int[heights.length];
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++) {
            if (stack.empty()) {
                leftSmall[i] = 0;
                stack.push(i);
            }
            else {
                while(!stack.empty() && heights[stack.peek()] >= heights[i]) {
                    stack.pop();
                }
                leftSmall[i] = stack.empty() ? 0 : stack.peek() + 1;
                stack.push(i);
            }
        }
        while(!stack.empty()) stack.pop();
        for(int i = heights.length -1; i >= 0; i--) {
            if (stack.empty()) {
                rightSmall[i] = heights.length -1;
                stack.push(i);
            }
            else {
                while(!stack.empty() && heights[stack.peek()] >= heights[i]) {
                    stack.pop();
                }
                rightSmall[i] = stack.empty() ? heights.length - 1 : stack.peek() - 1;
                stack.push(i);
            }
        }
        for(int i=0; i <heights.length; i++) {
            maxArea = Math.max(maxArea, (rightSmall[i] - leftSmall[i] + 1) * heights[i]);
        }
        return maxArea;
    }
}