class Solution {
    private int lo = 0;
    private int maxLen = 0;
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;
        for(int i = 0; i < s.length(); i++) {
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i+1);
        }
        return s.substring(lo, lo+maxLen);
    }
    public void checkPalindrome(String s, int j, int k) {
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (k-j - 1> maxLen) {
            maxLen = k - j - 1;
            lo = j+1;
        }
    } 
}