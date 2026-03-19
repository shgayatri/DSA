
import java.util.Scanner;
public class lower {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
    
                System.out.println(mid);
            }
            else if(arr[mid]<target){
                start=mid+1;

            }
            else{
                end=mid-1;
            }

        }
        System.out.println(start); // start joo h agar element find nhi hua too usse uski sahi jghn pr lgadega voo theek sa

    }
    
}
