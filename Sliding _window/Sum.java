package Sliding_window;

public class Sum {
    public static void main(String[]args){
        int arr []={3,4,5,6,7,8,9};
        int k=3;
        int n=arr.length;
        int sum=0;
        int MaxSum=sum;
        // phle jitni length h uske hissab se sum nikalo
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        // phir uss sum se common part lo or jo add krna h vo krdo aage wale koo last wale ko - krdooo 
        int i=1;
        int j=k;
        while(j<n){
            sum=sum+arr[j]-arr[i-1];
        if(MaxSum<sum){
            MaxSum=sum;
        }  
        i++;
        j++;
    }
    System.out.println(MaxSum);      


    }
    
}
