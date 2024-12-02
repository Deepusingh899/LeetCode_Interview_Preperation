class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[]=sentence.split(" ");
        int count=0;
        for(String index:arr){
            if(index.length()<searchWord.length()){
                count++;
                continue;
            }
            count++;
            String sub=index.substring(0,searchWord.length());
            if(searchWord.equals(sub)){
                return count;
            }
                        
        } 
        return -1;      
    }
}
