class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lis=new ArrayList<>();
        int max=nums.length;
        int[] num=new int[max+1];
        for(int i:nums){
            num[i]++;
        }
        for(int i=1;i<num.length;i++){
            if(num[i]==0){
                lis.add(i);
            }
        }

        return lis;        
    }
}