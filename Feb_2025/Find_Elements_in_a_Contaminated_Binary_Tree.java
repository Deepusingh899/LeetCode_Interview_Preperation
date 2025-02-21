import java.util.HashSet;


 public class Find_Elements_in_a_Contaminated_Binary_Tree {
    int val;
    Find_Elements_in_a_Contaminated_Binary_Tree left;
    Find_Elements_in_a_Contaminated_Binary_Tree right;
    Find_Elements_in_a_Contaminated_Binary_Tree() {}
    Find_Elements_in_a_Contaminated_Binary_Tree(int val) { this.val = val; }
    Find_Elements_in_a_Contaminated_Binary_Tree(int val, Find_Elements_in_a_Contaminated_Binary_Tree left, Find_Elements_in_a_Contaminated_Binary_Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class FindElements {
    HashSet<Integer> set=new HashSet<>();

    public FindElements(Find_Elements_in_a_Contaminated_Binary_Tree root) {
        dfs(root,0);
        
    }    
    public boolean find(int target) {
        return set.contains(target);
        
    }
    void dfs(Find_Elements_in_a_Contaminated_Binary_Tree root,int val){
        if(root==null) return;
        root.val=val;
        set.add(root.val);
        dfs(root.left,2*root.val+1);
        dfs(root.right,2*root.val+2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */