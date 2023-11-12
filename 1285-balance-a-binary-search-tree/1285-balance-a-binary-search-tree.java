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
    ArrayList<Integer> inOrderL = new ArrayList<>();

    private void inOrder(TreeNode root){
        if(root==null) return;

        inOrder(root.left);
        inOrderL.add(root.val);
        inOrder(root.right);
    }

    private TreeNode BST(int start, int end){
        if(start > end) return null;

        int mid = (start + end)/2 ;

        TreeNode root = new TreeNode(inOrderL.get(mid));
        root.left = BST(start, mid-1);
        root.right = BST(mid+1, end);

        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return BST(0, inOrderL.size()-1);
    }
}