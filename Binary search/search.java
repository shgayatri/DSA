import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start =0; // start y arr k phle index pr lgaa hota h
        int last=n-1;// last y arr k last index prr lga hota h 
        int ans=-1; // y hmne ek variable mana h jisme hmm mid ki value lenge or agar koi value find nhi hoti too usse hmm -1 se initialize kr denge
        while(start<=last){ // jb tk start last se chota nhi ho jata tb tkk loop chlega
            int mid=start+(last-start)/2; // yhn pr hmmne apna mid element nikala h agar hm mid ko simle way m nikalenge too vo bdde array k liye overflow kr jayega
            if(arr[mid]==target){  // y case 1 hh agar mid jo target k equal ho gya 
                ans=mid;
                System.out.println(ans);
                break;
            }
            else if(arr[mid]< target){ // agar chota h too start ko aage bdha denge
                start=mid+1;
            }
            else{
                last=mid-1; // bdda h too last ko kam kr denge
            }

        }
        System.out.println(ans); // or agr kuch bhi nhi h too -1 return kr denge 

    }
}
