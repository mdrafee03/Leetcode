class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length==0) return;
        int left=0;
        int right=0;
        while(right<nums.length){
            if(nums[right]==0){
                ++right;
                
            }
            else{
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                ++right;
                ++left;
                
            }
            
        }
        return;
    }
}