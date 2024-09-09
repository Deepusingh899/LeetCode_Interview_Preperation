class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {  
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        int result=0;
        int currDir=0;
        int[] currPos={0,0};
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int []obstacle: obstacles){
            if(!map.containsKey(obstacle[0])){
                map.put(obstacle[0],new HashSet<>());
            }
            map.get(obstacle[0]).add(obstacle[1]);
        }
        for(int command: commands){
            if(command==-1){
                currDir=(currDir+1)%4;
                continue;
            }
            if(command==-2){
                currDir=currDir-1;
                if(currDir==-1){
                    currDir=3;
                }
                continue;
            }
            int []direction=dir[currDir];
            for(int i=0;i<command;i++){
                int x=currPos[0]+direction[0];
                int y=currPos[1]+direction[1];
                if(map.containsKey(x) && map.get(x).contains(y)){
                    break;
                }
                currPos[0]=x;
                currPos[1]=y;
            }
            result=Math.max(result,(currPos[0]*currPos[0]+currPos[1]*currPos[1]));
        }
        return result;
    }
}