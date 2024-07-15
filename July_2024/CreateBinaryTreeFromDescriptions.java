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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        for(int bin[]: descriptions){
            //Parent Node
            if(!map.containsKey(bin[0])){
                map.put(bin[0],new TreeNode(bin[0]));
            }
            //Child Node
            if(!map.containsKey(bin[1])){
                map.put(bin[1],new TreeNode(bin[1]));
            }
            // Adding left Node
            if(bin[2]==1){
                map.get(bin[0]).left=map.get(bin[1]);
            }
            // Adding Right Node
            else{
                map.get(bin[0]).right=map.get(bin[1]);
            }
            set.add(bin[1]);
        }
        for(int bin[]: descriptions){
            if(!set.contains(bin[0])){
                return map.get(bin[0]);
            }
        }
        return null;        
    }
}