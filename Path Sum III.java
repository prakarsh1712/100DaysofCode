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
  public int pathSum(TreeNode root, int sum) {
    if (root == null)
      return 0;
    return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
  }

  private int dfs(TreeNode root, int sum) {
    if (root == null)
      return 0;
    return (sum == root.val ? 1 : 0) +   //
        dfs(root.left, sum - root.val) + //
        dfs(root.right, sum - root.val);
  }
}
