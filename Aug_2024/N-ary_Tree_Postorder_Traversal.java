/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> lis=new ArrayList<>();
        if(root==null) return lis;
        dfs(root,lis);
        return lis;        
    }
    public void dfs(Node root,List<Integer> lis){
        // System.out.println("Root of Graph :- "+root.val);
        for(Node child: root.children){
            // System.out.println("Childeren of "+ root.val+" :- "+child.val);
            dfs(child,lis);
        }
        lis.add(root.val);
    }
}