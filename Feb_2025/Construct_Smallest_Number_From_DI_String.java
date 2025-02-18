class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        boolean []used=new boolean[10];
        StringBuilder res=new StringBuilder();
        backtrack(pattern,0,new int[n+1],used,res);
        return res.toString();
    }
    public boolean backtrack(String pattern,int i,int[] num,boolean[] used,StringBuilder res){
        if(i>pattern.length()){
            for(int j=0;j<num.length;j++){
                res.append(num[j]);
            }
            return true;
        }
        for(int j=1;j<=9;j++){
            if(!used[j] && (i==0 || isValid(num[i-1],j,pattern.charAt(i-1)))){
                used[j]=true;
                num[i]=j;
                if(backtrack(pattern,i+1,num,used,res)){
                    return true;
                }
                num[i]=0;
                used[j]=false;

            }
        }
        return false;        
    }
    public boolean isValid(int lastDigit,int currentDigit,char condition){
        return ((condition=='I' && lastDigit<currentDigit) || (condition=='D' && lastDigit>currentDigit));
    }
}