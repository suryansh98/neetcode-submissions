class Solution {
    public int numIslands(char[][] grid) {
        
        int row = grid.length, col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        int cnt = 0;
        for(int i = 0; i < row; i++){

            for(int j = 0; j < col; j++){

                if(!visited[i][j] && grid[i][j] == '1')
                {
                    cnt++;
                    traverse(grid, i, j, visited);
                }
            }
        }

        return cnt;


    }


    public void traverse(char [][] grid, int i, int j, boolean[][] visited){

        if(i == grid.length || i == -1 || j == -1 || j == grid[0].length || grid[i][j] == '0' || visited[i][j])
            return;

        visited[i][j] = true;;

        traverse(grid, i + 1, j, visited);
        traverse(grid, i - 1, j, visited);
        traverse(grid, i, j + 1, visited);
        traverse(grid, i, j - 1, visited);
    }
}
