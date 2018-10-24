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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return myBuildTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1);
    }
    private int findPosition(int[] array,int start,int end,int key)
    {
        for(int i =start;i<=end;i++)
        {
            if(array[i]==key)
                return i;
        }
        return -1;
    }
    private TreeNode myBuildTree(int[] inorder, int instart, int inend,
            int[] preorder, int prestart, int preend) 
    {
         if (instart > inend) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[prestart]);
        int pos=findPosition(inorder,instart,inend,preorder[prestart]);
        root.left=myBuildTree(inorder,instart,pos-1,preorder,prestart+1,prestart+pos-instart);
        root.right=myBuildTree(inorder,pos+1,inend,preorder,pos-inend+preend+1,preend);
        return root;
    }
}