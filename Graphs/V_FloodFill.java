public class V_FloodFill {
    public static void dfs(int[][] image, int sr, int sc, int color, int ans[][], int delrow[], int delcol[], int iniColor) {
        ans[sr][sc] = color;
        int n = image.length;
        int m = image[0].length;
        for(int i=0; i<4; i++) {
            int nrow = sr + delrow[i];
            int ncol = sc + delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol] == iniColor && ans[nrow][ncol] != color) {
                dfs(image, nrow, ncol, color, ans, delrow, delcol, iniColor);
            }
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ans[][] = image;
        int iniColor = image[sr][sc];
        int delrow[] = {-1,0,+1,0};
        int delcol[] = {0,+1,0,-1};
        dfs(image, sr, sc,color, ans, delrow, delcol, iniColor);
        return ans;
    }
    public static void main(String[] args)
    {
        int[][] image =  {
	        {1,1,1},
	        {1,1,0},
	        {1,0,1}
	    };
     
        int[][] ans = floodFill(image, 1, 1, 2);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
