class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int []chara=new int[26];
        for(char ch: s.toCharArray()){
            chara[ch-'a']++;
        }

        StringBuilder sb=new StringBuilder();
        int index=25;
        while(index>=0){
            if(chara[index]==0){
                index--;
                continue;
            }
            int used=Math.min(chara[index],repeatLimit);
            for(int i=0;i<used;i++){
                sb.append((char)('a'+index));
            }
            chara[index]-=used;
            if(chara[index]>0){
                int prevIndex=index-1;
                while(prevIndex>=0 && chara[prevIndex]==0){
                    prevIndex--;
                }
                if(prevIndex<0) break;

                sb.append((char) ('a'+prevIndex));
                chara[prevIndex]--;
            }
        }
        return sb.toString();
        
    }
}