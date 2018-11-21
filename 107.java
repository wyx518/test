/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;
        int maxLevel = treeDepth(root) - 1;
        while (true) {
            List<Integer> level = new ArrayList<Integer>();
            dfs(root, level, 0, maxLevel);
            if (maxLevel < 0)
                break;
            result.add(level);
            maxLevel--;
        }
        return result;
    }
    
    private void dfs(TreeNode root, List<Integer> level, int curLevel, int maxLevel) {
        if (root == null || curLevel > maxLevel)
            return;
        if (curLevel == maxLevel)
            level.add(root.val);
        dfs(root.left, level, curLevel + 1, maxLevel);
        dfs(root.right, level, curLevel + 1, maxLevel);
    }
    
    private int treeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        return 1 + (left > right ? left : right);
    }
}