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
    public void bfs (TreeNode root , List<Integer> ans, int level){
       if(root==null) return;

       if(level==ans.size()) ans.add(root.val);

       else ans.set(level,Math.max(ans.get(level),root.val));

       bfs(root.left, ans, level+1);
       bfs(root.right, ans, level+1); 
       
    //    Queue<TreeNode> q = new LinkedList<>();
    //    List<Integer> ans = new ArrayList<>();
    //    q.add(root);

    //    while(!q.isEmpty()){
    //        int size = q.size();
    //        int max = Integer.MIN_VALUE;

    //        for(int i=0;i<size;i++){
    //          TreeNode front = q.remove();
    //          max = Math.max(max,front.val);
    //          if(root.left!=null) q.add(root.left);
    //          if(root.right!=null) q.add(root.right);
    //        }
    //        ans.add(max);
    //    }
    //    return ans;
    } 
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        bfs(root,ans,0);
        return ans;
    }
}