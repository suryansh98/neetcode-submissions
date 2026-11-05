class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length, col = grid[0].length;

        boolean visited[][] = new boolean[row][col];
        int max = 0;

        for(int i = 0; i < row; i++){

            for(int j = 0; j < col; j++)
            {
                if(!visited[i][j] && grid[i][j] == 1)
                {
                    int curr = traverse(visited, grid, i, j, row, col);

                    max = (int)Math.max(max, curr);
                }
            }
        }

        return max;
        
    }


    public static int traverse(boolean visited[][], int[][] grid, int i, int j, int row, int col){

        if(i < 0 || i == row || j < 0 || j == col || grid[i][j] == 0 || visited[i][j])
            return 0;
        
        visited[i][j] = true;

        return 1 + traverse(visited, grid, i + 1, j, row, col) + traverse(visited, grid, i - 1, j, row, col) + traverse(visited, grid, i, j + 1, row, col) + traverse(visited, grid, i, j - 1, row, col);
    }
}
