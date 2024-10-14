class Solution {
    public long maxKelements(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num:nums){
            pq.add(num);
        }
        while(k>0){
            int num=pq.poll();
            sum+=num;
            pq.add((int) Math.ceil(num/3.0));
            k--;
        }
        return sum;
    }
}