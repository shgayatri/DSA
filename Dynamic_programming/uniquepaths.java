import java.util.*;
public class uniquepaths {
    public static int Paths(int [][] grid){
        int m=grid.length;
        int n=grid[0].length;
        int [][]dp=new int [m][n];
        if(grid[0][0]==1||grid[m-1][n-1]==1){
            return 0;
        }
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                   if(grid[i][j]==1){
                    dp[i][j]=0;
                   }
                   if(i>0){
                    dp[i][j]+=dp[i-1][j];
                   }
                   if(j>0){
                    dp[i][j]+=dp[i][j-1];
                   }
            }
        }
        return dp[m-1][n-1];


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] grid= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println(Paths(grid));

    }
    
}
