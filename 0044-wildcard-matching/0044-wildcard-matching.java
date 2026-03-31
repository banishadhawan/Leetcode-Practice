class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        int starIndex = -1, match = 0;

        while (i < s.length()) {
            // Case 1: characters match OR '?'
            if (j < p.length() && 
               (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
                i++;
                j++;
            }
            // Case 2: '*' found
            else if (j < p.length() && p.charAt(j) == '*') {
                starIndex = j;
                match = i;
                j++;
            }
            // Case 3: mismatch but we had previous '*'
            else if (starIndex != -1) {
                j = starIndex + 1;
                match++;
                i = match;
            }
            // Case 4: no match
            else {
                return false;
            }
        }

        // Check remaining pattern
        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }

        return j == p.length();
    }
}