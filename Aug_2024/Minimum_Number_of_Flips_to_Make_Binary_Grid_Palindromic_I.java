class Solution {
    public int minFlips(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Calculate flips needed to make all rows palindromic
        int rowFlips = 0;
        for (int[] row : grid) {
            rowFlips += flipsToPalindrome(row);
        }
        
        // Calculate flips needed to make all columns palindromic
        int colFlips = 0;
        for (int col = 0; col < n; col++) {
            int[] colArr = new int[m];
            for (int row = 0; row < m; row++) {
                colArr[row] = grid[row][col];
            }
            colFlips += flipsToPalindrome(colArr);
        }
        
        return Math.min(rowFlips, colFlips);
    }
    
    private static int flipsToPalindrome(int[] arr) {
        int flips = 0;
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            if (arr[left] != arr[right]) {
                flips++;
            }
            left++;
            right--;
        }
        
        return flips;
        
    }
}