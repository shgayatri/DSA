package Prefix_Sum;

import java.util.Scanner;

public class minpenalty {
    public static int minPenalty(String customers){
        int n=customers.length();
        int [] prefix=new int [n+1];
        int [] suffix= new int [n+1];
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1];
            if(customers.charAt(i-1)=='N'){
                prefix[i]++;
            }
        }
        for(int i=n-1;i>=0;i--){
            suffix[i]=suffix[i+1];
            if(customers.charAt(i)=='Y'){
                suffix[i]++;
            }
        }
        int minpenalty=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            int penalty=prefix[i]+suffix[i];
            if(penalty<minpenalty){
                minpenalty=penalty;
            }
        }
        return minpenalty;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String customers=sc.nextLine();
        System.out.println(minPenalty(customers));
    }
    
    
}
