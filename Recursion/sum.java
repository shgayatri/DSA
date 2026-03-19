class sum{
    public static void sumNum(int n){
      if(n==0)
        return;
    System.out.println(n);
     sumNum(n-1);s
    }
    public static void main(String[]args) {
        int n=5;

        sumNum(n);
    }
}