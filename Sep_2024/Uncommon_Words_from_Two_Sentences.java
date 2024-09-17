class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String st:s1.split(" ")){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        for(String st:s2.split(" ")){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        ArrayList<String> list=new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }

        String[] str=new String[list.size()];
        list.toArray(str);
        return str;
        
    }
}