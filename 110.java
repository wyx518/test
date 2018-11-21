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
    public boolean isBalanced(TreeNode root) {
       return maxDepth(root)!=-1;
    }
    private int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
       else {
           int lh=maxDepth(root.left);
           int rh=maxDepth(root.right);
           if (lh == -1 || rh == -1 || Math.abs(lh-rh) > 1) {
            return -1;
           }
           return Math.max(lh,rh)+1;
       }
    }
}