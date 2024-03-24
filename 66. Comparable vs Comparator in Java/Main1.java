// Using Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {
        // Comparator<Integer> comp = new Comparator<>() {
        //     public int compare(Integer i, Integer j){
        //         if(i%10 > j%10){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };

        // since Comparator is a functional interface, we can rewrite above expression as:
        Comparator<Integer> comp = (i, j) -> i%10 > j%10 ? 1 : -1;  // rewrote using the concept of Functional Interface and lambda expressions

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(51);
        nums.add(43);
        nums.add(37);
        nums.add(12);
        nums.add(29);

        System.out.println(nums);
        // Collections.sort(nums); // sorting on the basis of whole numbers
        Collections.sort(nums, comp);   // sorting on the basis of the last digit
        System.out.println(nums);
    }
}
