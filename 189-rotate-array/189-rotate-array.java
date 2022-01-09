class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        int l = 0;
        int r = 0;
        int temp = nums[0];
        for(int counter=0; counter < nums.length; counter++) {
            int next;
            int nextVal;
            if (r+k >= size) next = r+k - size;
            else next = r+ k;
            nextVal = temp;
            temp = nums[next];
            nums[next] = nextVal;
            r = next;
            if (r == l && size >= l+2) {
                r = l+1;
                temp = nums[r];
                l++;
            }
        }
    }
}