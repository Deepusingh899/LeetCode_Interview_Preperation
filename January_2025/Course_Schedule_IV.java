import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] matrix=new boolean[numCourses][numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int source=prerequisites[i][0];
            int destination=prerequisites[i][1];
            matrix[source][destination]=true;
        };
        for(int i=0;i<numCourses;i++){
            for(int j=0;j<numCourses;j++){
                for(int k=0;k<numCourses;k++){
                    matrix[j][k]=matrix[j][k] || (matrix[j][i] && matrix[i][k]);
                }
            }
        }
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int source=queries[i][0];
            int destination=queries[i][1];
            list.add(matrix[source][destination]);
        }
        return list;
    }
}