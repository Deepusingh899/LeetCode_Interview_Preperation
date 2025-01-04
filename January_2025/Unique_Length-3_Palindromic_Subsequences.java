import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> firstOcc=new HashMap<>();
        HashMap<Character,Integer> lastOcc=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!firstOcc.containsKey(ch)){
                firstOcc.put(ch,i);
            }
            lastOcc.put(ch,i);
        }
        
        for(char ch: firstOcc.keySet()){
            int first=firstOcc.get(ch);
            int last=lastOcc.get(ch);
            if(first==last) continue;
            HashSet<Character> set=new HashSet<>();
            for(int i=first+1;i<last;i++){
                set.add(s.charAt(i));
            } 
            count+=set.size();  
        }
        return count;
        
    }
}