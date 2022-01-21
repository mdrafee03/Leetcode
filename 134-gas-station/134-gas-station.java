class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumDeviation = 0;
        int ValidStart = 0;
        int cumDeviation = 0;
        for (int i = 0; i < gas.length; i++) {
            sumDeviation += gas[i] - cost[i];
            cumDeviation += gas[i] - cost[i];
            if (cumDeviation < 0 && i+1 < gas.length) {
                cumDeviation = 0;
                ValidStart = i+1;
            }
        }
        if (sumDeviation >= 0) return ValidStart;
        return -1;
    }
}