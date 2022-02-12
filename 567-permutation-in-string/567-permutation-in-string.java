class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;     
        int cnt = s1.length();
        int s = 0, e = 0;
        int[] map = new int[26];
        for (char c : s1.toCharArray()) map[c - 'a'] ++;
        
        while (e < s2.length()) {
            if (map[s2.charAt(e ++) - 'a']-- > 0) cnt --;
            if (e - s == s1.length() && cnt == 0) return true;
            if (e - s == s1.length() && map[s2.charAt(s ++) - 'a']++ >= 0) cnt++;
        }
        
        return false;
    }
}