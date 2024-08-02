class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> que=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                if(map.get(a)==map.get(b)){
                    return b-a;
                }
                return map.get(a)-map.get(b);
            }
        });
        // Integer temp[]=new Integer[map.size()];
        int i=0;
        for(Integer numb: map.keySet()){
            // temp[i]=numb;
            // i++;
            que.offer(numb);
        }
        // Arrays.sort(temp,new Comparator<Integer>(){
        //     public int compare(Integer a,Integer b){
        //         if(map.get(a)==map.get(b)){
        //             return b-a;
        //         }
        //         return map.get(a)-map.get(b);
        //     }
        // })

        while(!que.isEmpty()){
            int k=que.poll();
            int f=map.get(k);
            for(int j=0;j<f;j++){
                nums[i]=k;
                i++;
            }
        }
        return nums;

        
    }
}