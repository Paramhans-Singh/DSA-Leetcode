/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {    
        TreeNode p = root.left;
        TreeNode q = root.right;

        return helper(root,p,q);  
    }
    public boolean helper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || p==null || q==null){
            return (p==q);
        }

        if(p.val != q.val) return false;

        return helper(root, p.left,q.right) && helper(root,p.right,q.left);
    }
}