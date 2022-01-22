class Solution {
    public String longestPalindrome(String s) {
        int curLen = s.length();
        while(curLen > 1) {
            for(int i = 0; i<=s.length() - curLen; i++) {
                int start = i;
                int end = i + curLen -1;
                while(start <= end) {
                    if (s.charAt(start) != s.charAt(end)) break;
                    start++;
                    end--;
                }
                if (start > end) return s.substring(i, curLen+i);
            }
            curLen--;
        }
        return s.substring(0,1);
    }
}