class Solution {
    public String kthDistinct(String[] arr, int k) {
        // ****** Using HashMap Data Structure ******
        HashMap<String,Integer> map=new HashMap<>();
        for(String str: arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str:arr){
            if(map.get(str)==1 && --k==0){
                return str;
            }
        }

        // ****** Using Hash Set Data Structure ******
        HashSet<String> dup=new HashSet<>();
        HashSet<String> dis=new HashSet<>();
        for(String str:arr){
            if(dup.contains(str)){
                continue;
            }
            if(dis.contains(str)){
                dis.remove(str);
                dup.add(str);
            }else{
                dis.add(str);
            }
        }
        for(String str:arr){
            if(dis.contains(str)){
                k--;
            }
            if(k==0){
                return str;
            }
        }
        return "";
    }
}