class Solution {
    public boolean canArrange(int[] arr, int k) {
        // Arrays.sort(arr);
        int n=arr.length;
        int map[]=new int[k];
        for(int element:arr){
            int rem=((element%k)+k)%k;
            map[rem]++;
        }
        
        if(map[0]%2!=0){
            return false;
        }
        for(int rem=1;rem<=k/2;rem++){
            int comp=k-rem;
            if((map[rem]!=map[comp])){
                return false;
            }
        }
        return true;
    }
}