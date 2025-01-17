import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int n=words1.length;
        int m=words2.length;
        List<String> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(String word: words1){
                if(word.contains(words2[i])){
                    if(list!=null && list.contains(word)) continue;
                    list.add(word);
                }
            }
        }
        return list;        
    }
}