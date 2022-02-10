class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int result = 0;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        for(int i =0; i<nums.length; i++) {
            sum+= nums[i];
            result+= preSum.getOrDefault(sum-k, 0);
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return result;        
    }
}