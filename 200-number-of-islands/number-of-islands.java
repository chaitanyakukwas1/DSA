class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int count = 0;

        boolean[][] vis = new boolean[n][m];

        for(int row = 0;row < n;row++){
            for(int col = 0;col < m;col++){
                if(grid[row][col] == '1' && !vis[row][col]){
                    
                    count++;
                    bfs(row, col, grid, vis);
                }
                    
            }
        }
        return count;

    }

    public void bfs(int row, int col, char[][] grid, boolean[][] vis){

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row,col});

        vis[row][col] = true;

        int[] dRow = {-1,0,1,0};
        int[] dCol = {0,1,0,-1};

        while(!q.isEmpty()){

            int[] current = q.poll();
            int r = current[0];
            int c = current[1];

            for(int i = 0;i < 4;i++){

                int newRow = r + dRow[i];
                int newCol = c + dCol[i];

                if(newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < m){
                        if(grid[newRow][newCol] == '1' && !vis[newRow][newCol]){
                            vis[newRow][newCol] = true;
                            q.add(new int[]{newRow,newCol});
                        }
                    }
            }
        }

    }
}