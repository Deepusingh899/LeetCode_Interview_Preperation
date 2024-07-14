class Solution {
    char str[];
    public int removeString(String s, int sc){
        char firstChar=s.charAt(0);
        char secChar=s.charAt(1);
        int write=0;
        int count=0;
        for(int read=0;str[read]!='$';read++){
            str[write]=str[read];
            write++;
            if(write>1){
                char first=str[write-2];
                char sec=str[write-1];
                if(first==firstChar && sec==secChar){
                    write-=2;
                    count+=sc;
                }
            }
        }
        str[write]='$';
        return count;
    }
    public int maximumGain(String s, int x, int y) {
        int n = s.length();
        str=new char[n+1];
        for(int i=0;i<n;i++){
            str[i]=s.charAt(i);
        }
        str[n]='$';
        String a=x>y ? "ab" : "ba";
        String b=(a.equals("ab")) ? "ba" : "ab";
        int sc=0;
        sc=removeString(a,Math.max(x,y));
        sc+=removeString(b,Math.min(x,y));
        return sc;
    }
}