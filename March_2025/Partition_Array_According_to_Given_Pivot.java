class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lCount = 0, pCount = 0;
        for (int num : nums) {
            if (num < pivot) lCount++;
            else if (num == pivot) pCount++;
        }

        int[] res = new int[nums.length];
        int left = 0, mid = lCount, right = lCount + pCount;
        
        for (int num : nums) {
            if (num < pivot) res[left++] = num;
            else if (num > pivot) res[right++] = num;
            else res[mid++] = num;
        }
        
        return res;
    }
}