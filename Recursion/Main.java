public class Main {
    public static void Sum(int i,int current,int n){
        int sum=0;
        if(i==n)
            sum+=i;
        System.out.println(sum);
        return;
        sum+=i;
        System.out.println(sum);;
        Sum(i,current,n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sum(current,n);
    }
    
}
