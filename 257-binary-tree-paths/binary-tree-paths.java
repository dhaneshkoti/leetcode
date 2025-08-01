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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        else if(root.left==null&&root.right==null){
            ans.add(""+root.val);
            return ans;
        }
        List<String> leftans=binaryTreePaths(root.left);
        List<String> rightans=binaryTreePaths(root.right);
        for(String str:leftans){
            ans.add(root.val+"->"+str);
        }
        for(String str:rightans){
            ans.add(root.val+"->"+str);
        }
        return ans;
    }
}