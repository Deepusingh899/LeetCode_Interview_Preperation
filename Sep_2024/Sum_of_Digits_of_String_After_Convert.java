class Solution {
    public int getLucky(String s, int k) {
        int sum1=0;
        String a="";
        for(char ch: s.toCharArray()){
            int num=ch-'a'+1;
            while(num>0){
                sum1+=(num%10);
                num=num/10;
            }
        }
        a=String.valueOf(sum1);
        // return Integer.parseInt(a);
        while(k>1){
            int sum=0;
            for(int i=0;i<a.length();i++){
                sum+=(a.charAt(i)-'0');
            }
            k--;
            a=String.valueOf(sum);
        }

        return Integer.parseInt(a);       
    }
}