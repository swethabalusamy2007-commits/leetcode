class Solution {
    public int islandPerimeter(int[][] grid) {
       /* for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return dfs(grid,i,j);
                }
            }
        }
        return 0;
    }
    public int dfs(int[][] grid,int row,int col){
        if(row<0||row>=grid.length||
        col<0||col>=grid[0].length){
            return 1;
        }
        if(grid[row][col]==0){
            return 1;
        }
        if(grid[row][col]==2){
            return 0;
        }
        grid[row][col]=2;
        int up=dfs(grid,row-1,col);
        int down=dfs(grid,row+1,col);
        int left=dfs(grid,row,col-1);
        int right=dfs(grid,row,col+1);
        
        return up+down+left+right;
    }
}*/

int row = grid.length;
        int col = grid[0].length;

        int perimeter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0) {
                        perimeter++;
                    }
                    if (i == row - 1 || grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                    if (j == 0 || grid[i][j - 1] == 0) {
                        perimeter++;
                    }
                    if (j == col - 1 || grid[i][j + 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}