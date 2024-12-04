class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0,n=str1.length(),m=str2.length();
        while(i<n && j<m){
            if(str1.charAt(i)==str2.charAt(j)
            || str1.charAt(i)==str2.charAt(j)-1
            || (str1.charAt(i)=='z' && str2.charAt(j)=='a'))
            {
                j++;
            }
            i++;
        }
        return (j==m);        
    }
}