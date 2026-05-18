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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        getInOrder(root,list); 
        if(list.size()==1)
        return true;
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1))
            return false;
        }
        return true;

    }
    void getInOrder(TreeNode node,ArrayList<Integer> list) {
        if (node == null) return;

        getInOrder(node.left,list);         // Traverse Left
        list.add(node.val);              // Visit Root
        getInOrder(node.right,list);        // Traverse Right
    }
}
