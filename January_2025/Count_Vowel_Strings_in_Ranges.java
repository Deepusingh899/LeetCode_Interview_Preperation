import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int count=0;
        int[] prefix=new int[words.length];
        prefix[0]=isVowel(words[0]);
        for(int i=1;i<words.length;i++){
            prefix[i]=prefix[i-1]+isVowel(words[i]);
        }
        int m=queries.length;
        int[] res=new int[m];
        for(int i=0;i<m;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l==0){
                res[i]=prefix[r];
            }else{
                res[i]=prefix[r]-prefix[l-1];
            }
        }
       return res;         
    }
    public int isVowel(String s){
        List<Character> list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        char first=s.charAt(0);
        char last=s.charAt(s.length()-1);
        if(list.contains(first) && list.contains(last)){
            return 1;
        }
        return 0;
    }
}