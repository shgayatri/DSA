
    import java. util.*;
class Main{
    public static double findMaxAverage(int [] nums, int k){
        int n=nums.length;
    
        double max,sum=0;
        // first window 
        for(int i=0;i<k;i++){// hmne phle apne k tk ka average nikala or max find krliya 
          sum+=nums[i];

        }
        max=sum/k;
        // new window 
        int i=0;
        int j=k;
        double max1=0;
        while(j<n){
            sum=sum+nums[j]-nums[i];// second window m se phle wala i too remove ho jayega or j wala add hoo jayega
            max1=sum/k;// average nikal liya 
            max=Math.max(max,max1);//jo max aaya tha first window ka usse hrr window k max se compare krenge 
            
            i++;
            j++;
        }
        return max; // highest max ko return kr denge 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
      double result=  findMaxAverage(arr,k);
        System.out.println("max element:" +result);
        
    }
    
}

