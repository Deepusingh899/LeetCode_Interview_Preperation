class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int targetArrivalTime=times[targetFriend][0];
        Arrays.sort(times,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
         });
        PriorityQueue<Integer> available=new PriorityQueue<>();
        PriorityQueue<int[]> occupiedChair=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }

         });
         int charNo=0;
         for(int[] arr: times){
            int arrivalTime=arr[0];
            int leavingTime=arr[1];
            while(!occupiedChair.isEmpty() && occupiedChair.peek()[0]<=arrivalTime){
                available.offer(occupiedChair.poll()[1]);
            }
            int currCharNo;
            if(available.isEmpty()){
                currCharNo=charNo;
                charNo++;
            }else{
                currCharNo=available.poll();
            }
            if(targetArrivalTime==arrivalTime) return currCharNo;
            occupiedChair.offer(new int[]{leavingTime,currCharNo});
         }
         return -1;        
    }
}