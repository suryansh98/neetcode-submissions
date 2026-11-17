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
    public int diameterOfBinaryTree(TreeNode root) {

       
       

        int[] curr = new int[1];

         max(root, curr);

         return curr[0];
    }



    public int max(TreeNode root, int[] curr)
    {
        if(root == null)
            return 0;

        
        int left = max(root.left, curr);
        int right = max(root.right, curr);

        curr[0] = (int)Math.max(curr[0], left + right);

        return 1 + (int)Math.max(left, right);
    }
}
