import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;;;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // a Stream object can only be used once
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);
        int result = nums.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0, (c,e) -> c+e);

        System.out.println(result);
        // s1.forEach(n -> System.out.println(n));
    }
}