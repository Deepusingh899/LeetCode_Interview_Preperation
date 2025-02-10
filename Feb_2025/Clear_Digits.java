class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }else{
                if(sb.length()!=0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
        
    }
}