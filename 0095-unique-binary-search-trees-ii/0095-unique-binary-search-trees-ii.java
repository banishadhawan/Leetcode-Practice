class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return build(1, n);
    }
    
    private List<TreeNode> build(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        
        // Base case
        if (start > end) {
            result.add(null);
            return result;
        }
        
        // Try every number as root
        for (int i = start; i <= end; i++) {
            
            // Generate all left and right subtrees
            List<TreeNode> leftTrees = build(start, i - 1);
            List<TreeNode> rightTrees = build(i + 1, end);
            
            // Combine
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        
        return result;
    }
}