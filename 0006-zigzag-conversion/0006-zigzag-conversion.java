class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] ans = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = new StringBuilder();
        }

        int i = 0;
        while (i < s.length()) {
            // Downward
            for (int index = 0; index < numRows && i < s.length(); index++) {
                ans[index].append(s.charAt(i++));
            }
            // Upward
            for (int index = numRows - 2; index > 0 && i < s.length(); index--) {
                ans[index].append(s.charAt(i++));
            }
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : ans) {
            res.append(sb);
        }
        return res.toString();
    }
}