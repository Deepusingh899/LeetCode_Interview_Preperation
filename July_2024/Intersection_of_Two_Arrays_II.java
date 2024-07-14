class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int []freq=new int [1001];
        List<Integer> inter=new ArrayList<>();
        for(int i:nums1){
            freq[i]++;
        }
        for(int i: nums2){
            if(freq[i]>0){
                inter.add(i);
                freq[i]--;
            }
        }
        int arr[]=new int[inter.size()];
        for(int i=0;i<inter.size();i++){
            arr[i]=inter.get(i);
        }
        return arr;
        
    }
}