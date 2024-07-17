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
    public TreeNode DFS(TreeNode root, HashSet<Integer> to_delete,List<TreeNode> forest){
        if(root==null) return root;
        //Traversing Left child
        root.left=DFS(root.left,to_delete,forest);
        //Traversing Right child
        root.right=DFS(root.right,to_delete,forest);
        if(!to_delete.contains(root.val)){
            return root; 
        }
        //Deleting the node
        if(root.left!=null){
            forest.add(root.left);
        }
        if(root.right!=null){
            forest.add(root.right);
        }
        root.left=null;
        root.right=null;
        return null;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: to_delete){
            set.add(i);
        }
        List<TreeNode> forest=new ArrayList<>();
        root=DFS(root,set,forest);
        if(root!=null){
            forest.add(root);
        }
        return forest;
    }
}