class Solution {
    public String shortestPalindrome(String s) {
        String str=new StringBuilder(s).reverse().toString();
        for(int i=0;i<str.length();i++){
            if(s.startsWith(str.substring(i))){
                System.out.print(str.substring(0,i));
                return str.substring(0,i)+s;
            }
        }
        return str+s;
    }
}