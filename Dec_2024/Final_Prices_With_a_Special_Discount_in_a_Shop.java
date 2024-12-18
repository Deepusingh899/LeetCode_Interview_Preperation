import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }
            int val=prices[i];
            if(!st.isEmpty()){
                prices[i]-=st.peek();
            }
            st.push(val);
        }
       return prices; 
    }
}