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
    public int helper (TreeNode root, int d[]){
        if(root == null){
            return 0;
        }
        int leftmax = Math.max(0,helper(root.left,d));
        int rightmax = Math.max(0,helper(root.right,d));

        d[0] = Math.max(d[0],(root.val+leftmax+rightmax));

        return (root.val+ Math.max(leftmax,rightmax));
    }

    public int maxPathSum(TreeNode root) {
    int d[] = new int[1];
    d[0] = root.val;
    int ans = helper(root,d);
    return d[0];    
    }
}