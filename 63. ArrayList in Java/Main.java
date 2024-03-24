import java.util.ArrayList;
import java.util.Collection;
// import java.util.List;

public class Main{
    public static void main(String[] args) {
        // Collection<Integer> c = new ArrayList<Integer>();   // use Collection when only adding and fetching objects from the ArrayList
        // List<Integer> c = new ArrayList<Integer>(); // use List when want to work with index of objects in the ArrayList
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(5);
        c.add(4);
        c.add(3);
        c.add(2);
        c.add(1);

        System.out.println(c);  // prints the whole ArrayList

        System.out.println(c.indexOf(1));   // returns index of value 2 from the ArrayList
        
        System.out.println(c.get(2));   // returns value at index 2 from the ArrayList

        // for(int i : c){
        //     System.out.println(i);
        // }
    }
}