class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res=new ArrayList<>();
        int num=1;
        for(int i=1;i<=n;i++){
            res.add(num);
            if(num*10<=n){
                num*=10;
            }else{
                while(num%10==9 || num==n){
                    num/=10;
                }
                num+=1;
            }
        }
        //Dfs
        // for(int i=1;i<10;i++){
        //     if(i>n) break;
        //     dfs(i,n,res);
        return res;
    }
    // public void dfs(int curNum,int target,List<Integer> res){
    //     if(curNum>target){
    //         return ;
    //     }
    //     res.add(curNum);
    //     for(int d=0;d<10;d++){
    //         if(curNum*10+d>target){
    //             break;
    //         }
    //         dfs(curNum*10+d,target,res);
    //     }
    // }
}