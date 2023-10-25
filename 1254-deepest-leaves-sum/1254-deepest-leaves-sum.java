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
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public int bfs (TreeNode root){
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       int ans = 0;
       int heightTree = height(root)-1;
       int level = 0;

       while(!q.isEmpty()){
           int size = q.size();

           for(int i=0; i<size; i++){
              TreeNode front = q.remove();
              if(front.left != null) q.add(front.left);
              if(front.right != null) q.add(front.right);
              if(front.right==null && front.left == null && level == heightTree){
                  ans+=front.val;
              }
           }
           level++;
       }
       return ans;
    }
    public int deepestLeavesSum(TreeNode root) {
       int ans = bfs(root);
       return ans; 
    }
}