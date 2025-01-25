import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        List<Deque<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int groupIndex=0;
        list.add(new LinkedList<>());
        list.get(groupIndex).offer(arr[0]);
        map.put(arr[0],groupIndex);
        for(int i=1;i<n;i++){
            if(arr[i]-list.get(groupIndex).peekLast()>limit){
                groupIndex++;
                list.add(new LinkedList<>());
            }
            map.put(arr[i],groupIndex);
            list.get(groupIndex).offer(arr[i]);
        }
        for(int i=0;i<n;i++){
            int gi=map.get(nums[i]);
            nums[i]=list.get(gi).poll();
        }
        return nums;
    }
}