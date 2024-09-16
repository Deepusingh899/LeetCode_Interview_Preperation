class Solution {
    public int findMinDifference(List<String> timePoints) {
        int minutes=0;
        int arr[]=new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++){
            int HH=Integer.parseInt(timePoints.get(i).substring(0,2));
            int MM=Integer.parseInt(timePoints.get(i).substring(3,5));
            if(HH==0){
                minutes=24*60+MM;
            }else{
                minutes=HH*60+MM; 
            }
            arr[i]=minutes;
        }
        int res=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            res=Math.min(res,(arr[i+1]-arr[i]));
        }
        return Math.min(res,24*60-arr[arr.length-1]+arr[0]);        
    }
}