class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        // Step 1: Try to make all values equal to tops[0]
        int result = rotate(tops[0],tops,bottoms);
         // Step 2: If tops[0] failed, try bottoms[0]
        if(result!=-1)  return result;
        // return result from checking bottoms[0]
        return rotate(bottoms[0],tops,bottoms);      
    }
    private int rotate(int target,int[] tops,int[] bottoms){
        int rotateTops=0;
        int rotateBottoms=0;
        for(int i=0;i<tops.length;i++){
            // if target is not on either tops or bottoms side, its impossible
            if(tops[i]!=target && bottoms[i]!=target){
                return -1;
            }
            //If tops doesnt have the target,it must be rotated
            if(tops[i]!=target){
                rotateTops++;
            }
            //If bottoms does not have the target , it must be rotated
            if(bottoms[i]!=target){
                rotateBottoms++;
            } 
        }
        return Math.min(rotateTops,rotateBottoms);
    }
}