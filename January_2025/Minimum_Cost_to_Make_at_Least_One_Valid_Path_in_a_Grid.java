import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {

    // Direction: right, left, down, up 
    int[][] dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
    public int minCost(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[][] minCost = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            Arrays.fill(minCost[row], Integer.MAX_VALUE);
        }
        //element [row, col]
        Deque<int[]> deque = new ArrayDeque<>();
        //insert first element
        deque.offer(new int[] { 0, 0 });
        minCost[0][0] = 0; //cost of source to source

        while (!deque.isEmpty()) {
            int[] curr = deque.poll(); //pollFirst
            int row = curr[0], col = curr[1];

            for (int dir = 0; dir < 4; dir++) {
                int nextRow = row + dirs[dir][0];
                int nextCol = col + dirs[dir][1];

                // Check if new position is valid
                if (
                    nextRow >= 0 &&
                    nextRow < rows &&
                    nextCol >= 0 &&
                    nextCol < cols
                ) {
                    // if direction is changed then cost will be 1
                    // grid[row][col] -> [1,4]
                    // dir -> [0,3] -> [1,4]
                    int cost = minCost[row][col];
                    int nextCellCost = (dir+1 == grid[row][col]) ? 0 : 1;
                    int newCost = cost + nextCellCost;
                
                    if (newCost < minCost[nextRow][nextCol]) {
                        minCost[nextRow][nextCol] = newCost;
                        if(nextCellCost == 0){
                            deque.offerFirst(new int[] {nextRow, nextCol });
                        }else{
                            deque.offerLast(new int[] {nextRow, nextCol });
                        }
                        
                    }
                }
            }
        }

        return minCost[rows - 1][cols - 1];
    }
}
