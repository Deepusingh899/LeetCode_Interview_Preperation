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
    public boolean findPath(TreeNode root,int target,StringBuilder path){
        if(root==null) return false;
        if(root.val==target) return true;
        if(root.left!=null){
            path.append("L");
            if(findPath(root.left,target,path)){
                return true;
            }
            //backtracking
            path.setLength(path.length()-1);
        }
        if(root.right!=null){
            path.append("R");
            if(findPath(root.right,target,path)){
                return true;
            }
            //backtracking
            path.setLength(path.length()-1);
        }
        return false;
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s=new StringBuilder();
        StringBuilder d=new StringBuilder();
        findPath(root,startValue,s);
        findPath(root,destValue,d);
        int i=0;int j=0;
        while(i<s.length() && j<d.length()){
            if(s.charAt(i)==d.charAt(j)){
                i++;
                j++;
            }else{
                break;
            }
        }
        String st="";
        for(int k=i;k<s.length();k++){
            st=st+"U";
        }
        for(int l=j;l<d.length();l++){
            st=st+d.charAt(l);
        }
        return st;
    }
}