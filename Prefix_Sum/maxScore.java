package Prefix_Sum;
import java.util.*;
public class maxScore {
     public int maxscore(String s) {
        int n=s.length();
        int [] prefix= new int [n+1];
        int [] suffix= new int [n+1];
        
        prefix[0]=0;
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1];
            if(s.charAt(i-1)=='0'){
                prefix[i]++;
            }
        }
        for(int i=n-1;i>=0;i--){
            suffix[i]=suffix[i+1];
            if(s.charAt(i)=='1'){
                suffix[i]++;
            }
        }
        int max=0;
        for(int i=1;i<n;i++){
            int score=prefix[i]+suffix[i];
            if(score>max){
                max=score;
            
            }
        }
           return max;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        maxScore obj=new maxScore();
        int result=obj.maxscore(s);
        System.out.println(result);
    }
}
    


