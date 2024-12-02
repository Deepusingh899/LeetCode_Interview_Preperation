class Solution {
    int MaxNum;
    public int maxUniqueSplit(String s) {
        MaxNum=0;
        HashSet<String> set=new HashSet<>();
        splitString(s,set,0);
        return MaxNum;        
    }
    public void splitString(String s,HashSet<String> set,int index){
        if(s.length()==index) {
           MaxNum=Math.max(MaxNum,set.size());
           return;             
        }

        for(int i=index;i<s.length();i++){
            String subString=s.substring(index,i+1);
            if(!set.contains(subString)){
                set.add(subString);
                splitString(s,set,i+1);
                set.remove(subString);
            }
        }
    }
}