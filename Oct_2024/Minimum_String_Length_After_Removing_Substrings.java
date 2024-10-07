class Solution {
    public int minLength(String s) {
        // Stack<Character> st= new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(st.isEmpty()){
        //         st.push(ch);
        //         continue;
        //     }
        //     if(ch=='B' && st.peek()=='A'){
        //         st.pop();
        //     }else if(ch=='D' && st.peek()=='C'){
        //         st.pop();
        //     }else{
        //         st.push(ch);
        //     }
        // }
        // return st.size();

        int n=s.length();
        char[] str=s.toCharArray();
        int w=0;
        for(int i=0;i<n;i++){
            if(w==0){
                str[w]=str[i];
                w++;
                continue;
            }
            if(str[i]=='B' && str[w-1]=='A'){
                w--;
            }else if(str[i]=='D' && str[w-1]=='C'){
                w--;
            }else{
                str[w]=str[i];
                w++;
            }
        }
       return w; 
    }
}