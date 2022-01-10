class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                l = i;
                break;
            }
        }
        for (int i = l+1; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, l, i);
                l++;
            }
            
        }
    }
    public int[] swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
        return nums;
    }
}