class MaxAreaIsland {
    public static int maxAreaOfIsland(int[][] grid) {
        int maxsize = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int islandsize = dfs(grid, i, j);
                    if (islandsize > maxsize) {
                        maxsize = islandsize;
                    }
                }
            }
        }
        return maxsize;
    }

    public static int dfs(int grid[][],int i,int j){
        if(i<0 || i==grid.length || j<0 || j==grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j] = 0;
        int count=1;
        count = count + dfs(grid,i+1,j);
        count = count + dfs(grid,i-1,j);
        count = count + dfs(grid,i,j+1);
        count = count + dfs(grid,i,j-1);
        return count;
    }
    public static void main(String[] args) {
        int grid[][] = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid));
    }
}