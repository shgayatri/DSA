 import java.util.ArrayList;
import java.util.Collections;
class Solu{
    public static void main(String[] args){
        ArrayList<Integer> List=new ArrayList<>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        System.out.println(List);
        Collections.reverse(List);
        System.out.println(List);
        Collections.sort(List);
        System.out.println("Ascending order"+ List);
        Collections.sort(List,Collections.reverseOrder());
        System.out.println("Descending order"+ List);
        ArrayList<String>L1= new ArrayList<>();
        L1.add("Gayatri");
        L1.add("Ashita");
        L1.add("Navya");
        L1.add("Navika");
        L1.add("Navyansh");
        System.out.println(L1);
        Collections.sort(L1);
        System.out.println("sort"+L1);
        
    }
}

    

