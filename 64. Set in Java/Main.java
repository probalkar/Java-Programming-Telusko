import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>(); // does not have sorted arrangement of elements
        // Collection<Integer> nums = new HashSet<Integer>();  // also works with Collection as it is super class of Set
        Collection<Integer> nums = new TreeSet<Integer>();  // have sorted arrangement of elements
        nums.add(52);
        nums.add(41);
        nums.add(36);
        nums.add(27);
        nums.add(13);

        // System.out.println(nums);

        Iterator<Integer> values = nums.iterator(); 

        while(values.hasNext()){
            System.out.println(values.next());
        }

        // for(int n : nums){
        //     System.out.println(n);
        // }
    }
}
