public class maze {
    public static boolean check(int maze[][],int sol[][],int x,int y)
    {
        int n = maze.length;
        if(x<0||x>=n||y<0||y>=n)
        {
            return false;
        }
        if(maze[x][y]==0||sol[x][y]==1)
        {
            return false;
        }
        return true;
    }
    public static void solve(int x,int y,int maze[][], int sol[][])
    {
        int n=maze.length;
        if(x==n-1&&y==n-1)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(sol[i][j]+" ");
                }
                System.out.print("----");
            }
            System.out.print("---------");
            return ;
        }
        if(check(maze,sol,x,y+1))
        {
            sol[x][y+1]=1;
            solve(x,y+1,maze,sol);
            sol[x][y+1]=0;
        }
        if(check(maze,sol,x,y-1))
        {
            sol[x][y-1]=1;
            solve(x,y-1,maze,sol);
            sol[x][y-1]=0;
        }
        if(check(maze,sol,x+1,y))
        {
            sol[x+1][y]=1;
            solve(x+1,y,maze,sol);
            sol[x+1][y]=0;
        }
        if(check(maze,sol,x-1,y))
        {
            sol[x-1][y]=1;
            solve(x-1,y,maze,sol);
            sol[x-1][y]=0;
        }
    }
    public static void main(String[] args) {
        int maze[][] = {{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        int n=4;
        int sol[][]= new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                sol[i][j]=0;
            }
        }
        sol[0][0]=1;
        solve(0,0,maze,sol);
    }
}