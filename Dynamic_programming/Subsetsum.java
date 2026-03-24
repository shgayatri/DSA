package Dynamic_programming;
import java.util.Scanner;
public class Subsetsum {
    public static boolean subset(int nums[],int sum){
        int n=nums.length;
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
                }
            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=sum;j++){
                    if(nums[i-1]<=j){
                        dp[i][j]=dp[i-1][j-nums[i-1]]||dp[i-1][j];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
            return dp[n][sum];
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int nums[]=new int [n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int sum=sc.nextInt();
            boolean ans=subset(nums,sum);
            System.out.println(ans);
        }
    }
    

