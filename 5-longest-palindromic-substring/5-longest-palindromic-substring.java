class Solution {
    private int start = 0;
    private int end = 0;
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;
        for(int i = 0; i < s.length() - (end-start+1)/2; i++) {
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i+1);
        }
        return s.substring(start, end+1);
    }
    public void checkPalindrome(String s, int j, int k) {
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (end - start + 1 < k - j -1) {
            start = j+1;
            end = k-1;
        }
    } 
}