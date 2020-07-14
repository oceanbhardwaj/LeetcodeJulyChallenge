class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int up=0;
        int down=0;
        int left=0;
        int right=0;
        int perimeter=0;
        for(int i=0;i<n;i++)
        {
for(int j=0;j<m;j++)
{
    if(grid[i][j]==1)
    {
      if(i==0)
          up=0;
        else
            up=grid[i-1][j];
        if(i==n-1)
            down=0;
        else
            down=grid[i+1][j];
        if(j==0)
            left=0;
        else
            left=grid[i][j-1];
        if(j==m-1)
            right=0;
        else
            right=grid[i][j+1];
            
          perimeter=perimeter+4-(up+down+left+right);}}  }
            return perimeter;
            
            
            
            
    
    
    
    
           
            
            
            
            
            
            
        