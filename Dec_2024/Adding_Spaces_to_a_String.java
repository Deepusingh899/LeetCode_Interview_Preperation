class Solution {
    public String addSpaces(String s, int[] spaces) {
        int index=0;
        int n=s.length();
        int m=spaces.length;
        StringBuilder sb=new StringBuilder();        
        for(int i=0;i<n;i++){
            if(index<m && spaces[index]==i){
                sb.append(' ');
                index++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();       
    }
}