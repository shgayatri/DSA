import java.util.*;
class Main{
    public static void Sum(int [] nums,int i,int sum,int n,List<Integer>ans){
        if(i==n){
            ans.add(sum);
            return;
        }
       
        Sum(nums,i+1,sum+nums[i],n,ans);
    
        Sum(nums,i+1,sum,n,ans);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        List<Integer>ans=new ArrayList<>();
        
        Sum(nums,0,0,n,ans);
        System.out.println(ans);
    }
}