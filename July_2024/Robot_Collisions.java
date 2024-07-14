class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length;
        Integer idx[]=new Integer[n];
        for(int i=0;i<n;i++){
            idx[i]=i; //[0,1,2,3,4,5,6,7]; 
        }
        Arrays.sort(idx,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                //increasing order of position sort'''
                //return negative or 0 no swap
                //if pos then swap
               return positions[a]-positions[b] ;
            }
        });
        List<Integer> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i: idx){
            if(directions.charAt(i)=='R'){
                st.push(i);
            }else{
                //incoming Robot which is left
                boolean flag=true;
                while(!st.isEmpty()){
                    int top=st.peek();
                    //case 1: if direction of top is Left then insert
                    if(directions.charAt(top)=='L'){
                        flag=true;
                        break;
                    }
                    //Case 2: if Top is R and health is more than index
                    else if(healths[top]>healths[i]){
                        flag=false;
                        healths[i]=0;
                        healths[top]-=1;
                        break;                    

                    }
                    //Case 3: if Top is R and health is less than index
                    else if(healths[top]<healths[i]){
                        flag=true;
                        healths[top]=0;
                        healths[i]-=1;
                        st.pop();
                    }
                    //Case 4: if top is R and health is equal to index
                    else{
                        flag=false;
                        healths[top]=0;
                        healths[i]=0;
                        st.pop();
                        break;
                    }
                }
                if(flag){
                    st.push(i); //left direction robot
                }
            }
        }
        for(int i=0;i<n;i++){
            if(healths[i]>0){
                res.add(healths[i]);
            }
        }
        return res;
    }
}