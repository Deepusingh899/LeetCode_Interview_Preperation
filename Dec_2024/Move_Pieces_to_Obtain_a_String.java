class Solution {
    public boolean canChange(String start, String target) {
        int i=0;
        int j=0;
        int n=start.length();
        while(i<n || j<n){
            //skipping all the blank spaces from the start
            while(i<n && start.charAt(i)=='_') i++;
            //skipping all the blank spaces from the start
            while(j<n && target.charAt(j)=='_') j++;

            // count is same only if both the string end at the same time
            if(i==n || j==n){
                return (i==n && j==n);
            }

            // check false condition

            if(start.charAt(i)!= target.charAt(j) ||
               (start.charAt(i)=='L' && j>i) ||
               (start.charAt(i)=='R' && j<i)
            ){
                return false;
            }
            i++;
            j++;
        }
        return true;
        
    }
}