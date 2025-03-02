import java.util.ArrayList;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        ArrayList<int[]> result=new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i][0]==nums2[j][0]){
                result.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }else if(nums1[i][0]<nums2[j][0]){
                result.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }else{
                result.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }
        while(i<n){
            result.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j<m){
            result.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }
        int len=result.size();
        int[][] res=new int[len][2];
        for(int ind=0;ind<len;ind++){
            res[ind]=result.get(ind);
        }
        return res;        
    }
}