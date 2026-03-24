package Dynamic_programming;

public class subsetpartition {
    public static boolean subset(int nums[]){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
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
            int nums[]={1,5,11,5};
            boolean ans=subset(nums);
            System.out.println(ans);
        }
    
}
