class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        int teams=n/2;
        int totalSum=0;
        // HashMap<Integer,Integer> map=new HashMap<>();
        int[] map=new int[1001];
        for(int num:skill){
            // map.put(num,map.getOrDefault(num,0)+1);
            map[num]++;
            totalSum+=num;
        }
        if(totalSum%teams!=0) return -1;

        int target=totalSum/teams;
        long res=0;
        for(int element:skill){
            // if(map.get(element)==0) continue;
            if(map[element]==0) continue;
            // map.put(element,map.get(element)-1);
            map[element]--;
            int partner=target-element;
            // if(!map.containsKey(partner) || map.get(partner)==0) return -1;
            if(map[partner]==0) return -1;
            // map.put(partner,map.get(partner)-1);
            map[partner]--;
            res+=(long)element*(long)partner;
        }
        return res;
    }
}