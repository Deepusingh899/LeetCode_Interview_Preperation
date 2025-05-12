import java.util.PriorityQueue;

class Solution {
    public int minTimeToReach(int[][] moveTime) {
        // Step 1: Get the dimensions of the dungeon (n x m)
        int n = moveTime.length;         // Number of rows
        int m = moveTime[0].length;      // Number of columns
        // Step 2: Priority queue to store (time, row, col), sorted by the minimum time
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // Add the starting point (0, 0) with time = 0
        pq.add(new int[]{0, 0, 0});
        // Step 3: Create a 2D array to store the minimum time to reach each cell
        int[][] time = new int[n][m];
        // Initialize all cells with the maximum possible time (infinity)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) 
                time[i][j] = Integer.MAX_VALUE;
            }
           // Step 4: Directions for moving in the grid (right, down, left, up)
            int[] dirx = new int[]{0, 1, 0, -1};   // Changes in x-coordinate
             int[] diry = new int[]{1, 0, -1, 0};   // Changes in y-coordinate
            // (0, 1) -> right, (1, 0) -> down, (0, -1) -> left, (-1, 0) -> up
            // BFS using priority queue to explore the dungeon
            while(!pq.isEmpty()) {
                // Step 5: Extract the current position with the minimum time from the queue
                int[] a = pq.poll();
                int t = a[0];  // Current time
                int x = a[1];  // Current row
                int y = a[2];  // Current column
                // Step 6: If we reached the bottom-right corner, return the time taken
                if(x == n - 1 && y == m - 1) return t;
                // Step 7: Explore the four possible directions
                for(int i = 0; i < 4; i++) {
                    // Calculate new coordinates after moving in the current direction
                    int xx = x + dirx[i];   // New row
                    int yy = y + diry[i];   // New column
                    // Check if the new coordinates are within the grid boundaries
                    if(xx >= 0 && xx < n && yy >= 0 && yy < m) {
                        // Get the minimum time required to move to this room
                        int wt = moveTime[xx][yy];
                        // Calculate the time when we can reach the new room
                        // max(t + 1, wt + 1) ensures that we move after the room is accessible
                        int tt = Math.max(t + 1, wt + 1);

                        // Step 8: If the calculated time is less than the previously recorded time
                        if(time[xx][yy] > tt) {
                             // Update the minimum time to reach this cell
                            time[xx][yy] = tt;

                            // Add the new state to the priority queue
                            pq.add(new int[]{tt, xx, yy});
                        }
                    }
                }
            }

        // If the destination is not reachable, return -1 (edge case, should not happen)
        return -1;
    }
}
