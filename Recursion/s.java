import java.util.Scanner;
public class s {
    public static void sumNo(int current,int n){
        if(current>n)
            return;
        System.out.println(n);
        sumNo(current+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int current=sc.nextInt();
        sumNo(current,n);

    }
    
}
