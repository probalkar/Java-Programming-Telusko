import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Map<String, Integer> students = new HashMap<>();    // HashMap is not synchronized nor sorted
        Map<String, Integer> students = new Hashtable<>();  // Hashtable is synchronized but also not sorted
        students.put("Probal Kar", 49);
        students.put("Smita Jagdale", 56);
        students.put("Awantika Ankushe", 69);

        System.out.println(students);   // prints the map object in key value pairs
        System.out.println(students.keySet());  // prints set of keys in students object

        for(String s : students.keySet()){
            System.out.println(s + " : " + students.get(s));
        }
    }
}
