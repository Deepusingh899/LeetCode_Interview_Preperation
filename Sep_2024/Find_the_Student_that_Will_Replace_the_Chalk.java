class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        // int i=0;
        int n=chalk.length;
        long totalChalk=0;
        for(int i: chalk){
            totalChalk+=i;
        }
        k=(int)(k%totalChalk);

        for(int i=0;i<n;i++){
            if(k<chalk[i]) return i;
            k-=chalk[i];
        }
        return 0;
    }
}