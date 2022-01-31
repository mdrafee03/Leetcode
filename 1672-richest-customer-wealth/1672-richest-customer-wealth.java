class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] i: accounts) {
            int total = 0;
            for(int money: i) total += money;
            max = Math.max(max, total);
        }
        return max;
    }
}