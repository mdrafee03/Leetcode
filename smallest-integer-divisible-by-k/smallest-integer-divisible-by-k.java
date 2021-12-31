class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k%2 == 0 || k%5 == 0) return -1;
        for (int i = 1 , r = 0; i <= k; i++) {
            r = (r * 10 + 1)%k;
            if (r == 0) return i;
        }
        return -1;
    }
}