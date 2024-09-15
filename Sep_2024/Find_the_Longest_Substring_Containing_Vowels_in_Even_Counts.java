class Solution {
    public int findTheLongestSubstring(String s) {
        int[] map=new int[32];
        Arrays.fill(map,-2);
        map[0]=-1;
        int mask=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            switch(c){
                case 'a':
                    mask^=1;
                    break;
                case 'e':
                    mask^=2;
                    break;
                case 'i':
                    mask^=4;
                    break;
                case 'o':
                    mask^=8;
                    break;
                case 'u':
                    mask^=16;
                    break;
            }
            int last=map[mask];
            if(last==-2){
                map[mask]=i;
            }else{
                maxLength=Math.max(maxLength,i-last);
            }
        }
        return maxLength;
        
    }
}