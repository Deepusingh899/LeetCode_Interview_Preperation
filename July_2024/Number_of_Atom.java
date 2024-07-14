class Solution {
    public String countOfAtoms(String formula) {
        Stack<HashMap<String,Integer>> st=new Stack<>();
        st.push(new HashMap<String,Integer>());
        int i=0;
        int n=formula.length();
        while(i<formula.length()){
            char ch=formula.charAt(i);
            if(ch=='('){
                st.push(new HashMap<String,Integer>());
                i++;
            }else if(ch==')'){
                HashMap<String,Integer> currMap=st.pop();
                i++;//move to next character
                //find the multiplier
                StringBuilder mp=new StringBuilder();
                while(i<n && Character.isDigit(formula.charAt(i))){
                    mp.append(formula.charAt(i));
                    i++;
                }
                //multiply the count -()n
                if(mp.length()>0){
                    int m=Integer.parseInt(mp.toString());
                    for(String atom: currMap.keySet()){
                        currMap.put(atom,currMap.get(atom)*m);
                    }
                }
                for(String in :currMap.keySet()){
                    st.peek().put(
                        in,
                        st.peek().getOrDefault(in,0)+currMap.get(in)
                    );
                }

            }else{
                StringBuilder aName=new StringBuilder();
                aName.append(ch);
                i++;
                while(i<n && Character.isLowerCase(formula.charAt(i))){
                    aName.append(formula.charAt(i));
                    i++;
                }
                StringBuilder count=new StringBuilder();
                while(i<n && Character.isDigit(formula.charAt(i))){
                    count.append(formula.charAt(i));
                    i++;
                }
                int c=(count.length()>0) ? Integer.parseInt(count.toString()):1;
                st.peek().put(
                        aName.toString(),
                        st.peek().getOrDefault(aName.toString(),0)+c
                    );
                }
            }
            TreeMap<String,Integer> sMap = new TreeMap<>(st.peek());
            StringBuilder res =new StringBuilder();
            for(String a: sMap.keySet()){
                res.append(a);
                int count=sMap.get(a);
                if(count>1){
                    res.append(count);
                }
            }        
        return res.toString();
    }
}