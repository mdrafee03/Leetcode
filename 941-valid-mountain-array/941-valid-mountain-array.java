class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        boolean isIncreasing = true;
        for(int i=1; i<arr.length; i++) {
            if (i == 1 && arr[i] < arr[i-1]) return false;
            if (arr[i] == arr[i-1]) return false;
            if (arr[i] < arr[i-1] && isIncreasing) isIncreasing = false;
            if (arr[i] > arr[i-1] && isIncreasing == false) return false;
        }
        return isIncreasing ? false: true;
    }
}