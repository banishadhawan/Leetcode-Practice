class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();
        int sign = 1;
        long ans = 0;

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {

            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            ans = ans * 10 + (s.charAt(i) - '0');

            // Overflow check
            if (sign * ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign * ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * ans);
    }
}