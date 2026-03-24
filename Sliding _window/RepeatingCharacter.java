import java.util.HashMap;
import java.util.Scanner;
public class RepeatingCharacter {
    public static int Longestcharcter(String s){
        int n=s.length();
        HashMap <Character,Integer> map= new HashMap<>();
         int i=0;// starting point of window
        int j=0;// ending point of window
        int maxlen=0; 
        while(j<n){
            char ch=s.charAt(j);
            // if character is already in the substring, move start i after its previous index
            if(map.containsKey(ch)){
                    i=Math.max(map.get(ch)+1,i);
            }
            // update last index of chracter
                map.put(ch,j);
                maxlen=Math.max(maxlen,j-i+1);
            
                j++;
            
        }
        return maxlen;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int ans=Longestcharcter(s);
        System.out.println(ans);
    
    }

