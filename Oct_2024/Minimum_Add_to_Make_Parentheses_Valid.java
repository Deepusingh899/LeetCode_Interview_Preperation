class Solution {
    public int minAddToMakeValid(String s) {
        // Time Complexity O(N) and Space Complexity O(1)
        int c=0;
        int misbracket=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                c++;
            }else{
                if(c>0){
                    c--;
                }else{
                    misbracket++;
                }
            }
        }
        return c+misbracket;

        // Time Complexity O(N) and Space Complexity O(N)

        // Stack<Character> st= new Stack<>();
        // int c=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch=='('){
        //         st.push(ch);
        //     }else{
        //         if(st.isEmpty()){
        //             c++;
        //         }else{
        //             st.pop();
        //         }
        //     }
        // }
        // return c+st.size();
        
    }
}