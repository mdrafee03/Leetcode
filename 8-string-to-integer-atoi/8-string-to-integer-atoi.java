class Solution {
    public int myAtoi(String s) {
        if (s.isEmpty()) return 0;
        int result = 0;
        int sign = 1;
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' ') i++;
        if (i >= s.length()) return 0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = s.charAt(i++) == '-' ? -1 : 1;
        }
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9')  {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE /10 && s.charAt(i) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + s.charAt(i++) - '0';
        }
        return result * sign;
    }
}