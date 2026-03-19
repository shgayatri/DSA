 import java.util.Scanner;
 public class firstocc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
              if(mid==0||arr[mid-1]!=target && mid=n-1||arr[mid+1]!=target){ // hmne check kiya h ki jo hmare mid-1 pr h agar vo same element nhi h too hmm simply mid return krenge prr agar vo same h too hm high=mid-1 krdenge
                ans=mid;
                break;

              }
              else{
                end=mid-1;
                start=mid+1;
              }
            }
            else if(arr[mid]<target){
                    start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(ans);

    }
    
}
