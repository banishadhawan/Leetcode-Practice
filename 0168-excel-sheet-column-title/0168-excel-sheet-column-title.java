class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Convert to 0-based indexing
            result.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}