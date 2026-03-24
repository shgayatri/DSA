package Dynamic_programming;
import java.util.Scanner;
public class knapsack {
    // =========================
    // Function: 0/1 Knapsack DP
    // Input: wt[] - weights of items
    //        val[] - values of items
    //        w - max capacity of knapsack
    // Output: Maximum total value
    // =========================
    public static int knap(int wt[],int w,int val[]){
        int n=wt.length;
         // =========================
        // Step 1: Initialize DP Table
        // dp[i][j] = max value using first i items with capacity j
        // =========================
        int dp[][]=new int [n+1][w+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                if(i==0||j==0){
                    dp[i][j]=0;//base case: no items or capacity 0//

                }
            }
        }   

        // =========================
        // Step 2: Fill the DP Table
        // Decide whether to take or skip each item
        // =========================

        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(wt[i-1]<=j){
                    // Item can be included: take max of including or skipping
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]] // include item 
                        ,dp[i-1][j]);//skip item
                }
                else{
                    dp[i][j]=dp[i-1][j];// Item cannot be included: skip it

                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int wt[]=new int[n];
        int val[]=new int [n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
            val[i]=sc.nextInt();
        }
        int w=sc.nextInt();
        System.out.println(knap(wt,w,val));

    }
    
}
