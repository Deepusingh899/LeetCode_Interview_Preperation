class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        int n=expression.length();
        List<Integer>[][] dp=new ArrayList[n][n];
        return recur(expression,0,n-1,dp);        
    }

    public List<Integer> recur(String exp,int start,int end,List<Integer>[][] dp){
        if(dp[start][end]!=null){
            return dp[start][end];
        }
        List<Integer> lis=new ArrayList<>();
        if(start==end){
            lis.add(exp.charAt(start)-'0');
            return lis;
        }
        if(end-start==1 && Character.isDigit(exp.charAt(start))){
            int num=Integer.parseInt(exp.substring(start,end+1));
            lis.add(num);
            return lis;
        }
        for(int i=start;i<=end;i++){
            if(Character.isDigit(exp.charAt(i))){
                continue;
            }
            char op=exp.charAt(i);
            List<Integer> left=recur(exp,start,i-1,dp);
            List<Integer> right=recur(exp,i+1,end,dp);
            for(int l: left){
                for(int r: right){
                    if(op=='*'){
                        lis.add(l*r);
                    }else if(op=='+'){
                        lis.add(l+r);
                    }else{
                        lis.add(l-r);
                    }
                }
            }
        }
        dp[start][end]=lis;
        return lis;

    }
}