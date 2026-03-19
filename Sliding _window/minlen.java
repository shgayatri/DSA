package Sliding_window;

import java.util.Scanner;


public class minlen {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int target=sc.nextInt();
    int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int i=0;
    int j=0;
    int minlen=Integer.MAX_VALUE;
    int len;
    int sum=0;
    while(j<n){
      sum+=arr[j];
      while(sum>=target){
        len=j-i+1;
        minlen=Math.min(minlen,len);
        sum-=arr[i];
        i++;
      }
      j++;
    }
    if(minlen==Integer.MAX_VALUE){
       
     System.out.println(0);
    }
        else {
            System.out.println(minlen); }

}
    
}
