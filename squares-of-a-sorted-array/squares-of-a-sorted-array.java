class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        for (int index = result.length -1; index >= 0; index--) {
            if (Math.abs(nums[right]) >= Math.abs(nums[left])) {
                result[index] = nums[right] * nums[right];
                right--;
            } else {
                result[index] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }
}
