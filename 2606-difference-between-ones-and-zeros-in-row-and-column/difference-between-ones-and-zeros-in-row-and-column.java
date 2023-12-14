class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int mainRow = grid.length;
        int mainCol = grid[0].length;

        int zeroesRow[] = new int[grid.length];
        // int onesRow[] = new int[grid.length];
        int zeroesCol[] = new int[grid[0].length];
        // int onesCol[] = new int[grid[0].length];

        int row = 0;
        while(row<grid.length){
            int zeroes = 0;
            // int ones = 0;

        for(int col=0; col<grid[0].length; col++){
            if(grid[row][col]==0)zeroes++;
            // else ones++;
        }
        zeroesRow[row] = zeroes;
        // onesRow[row] = ones;

        row++;
        }

        int col1 = 0;
        while(col1<grid[0].length){
            int zeroes = 0;
            // int ones = 0;
            for(int row1=0; row1<grid.length; row1++){
                if(grid[row1][col1]==0)zeroes++;
                //  else ones++;
                 }
                 zeroesCol[col1] = zeroes;
                //  onesCol[col1] = ones;

                 col1++;
        }

        int ans[][] = new int[grid.length][grid[0].length];
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
             ans[i][j] = ((mainRow-zeroesRow[i])+ (mainCol-zeroesCol[j])) - (zeroesRow[i]+zeroesCol[j]);
            }
        }

        return ans;
    }
}