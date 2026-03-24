import java.util.Scanner;
public class count {
    public static int countsubsets(int nums[],int sum){
        int n=nums.length;
        int dp[][]=new int [n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j-nums[i-1]]+dp[i-1][j];// include item + skip item

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
        int ans=countsubsets(nums,sum);
        System.out.println(ans);
    }
}